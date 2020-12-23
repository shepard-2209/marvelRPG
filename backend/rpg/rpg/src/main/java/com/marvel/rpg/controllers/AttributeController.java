package com.marvel.rpg.controllers;

import com.marvel.rpg.dtos.NewAttributeDTO;
import com.marvel.rpg.dtos.UpdateAttributeDTO;
import com.marvel.rpg.entitys.Attribute;
import com.marvel.rpg.repository.AttributeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/attributes")
public class AttributeController {

    @Autowired
    AttributeRepository repository;

    @PostMapping
    public ResponseEntity createAttribute(@RequestBody NewAttributeDTO newAttributeDTO) {
        Attribute attribute = new Attribute(newAttributeDTO);
        this.repository.save(attribute);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity getAttributes() {
        ResponseEntity response;
        if(this.repository.count() > 0) {
            response = ResponseEntity.ok(repository.findAll());
        } else {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity getAttribute(@PathVariable Long id) {
        ResponseEntity response;
        Optional<Attribute> searchAttribute = this.repository.findById(id);
        if(searchAttribute.isPresent()) {
            response = ResponseEntity.ok(searchAttribute.get());
        } else {
            response = ResponseEntity.notFound().build();
        }
        return response;
    }

    @PutMapping("/{id}")
    public ResponseEntity updateAttribute(@PathVariable Long id,
                                          @RequestBody UpdateAttributeDTO updateAttribute) {
        ResponseEntity response;
        if(this.repository.existsById(id)) {
            Attribute update = this.repository.findById(id).get();
            update.setHealthPoints(updateAttribute.getHealthPoints());
            update.setVigor(updateAttribute.getHealthPoints() * 200);
            update.setStrength(updateAttribute.getStrength());
            update.setIntelligence(updateAttribute.getIntelligence());
            update.setAgility(updateAttribute.getAgility());
            update.setResistence(updateAttribute.getResistence());
            update.setCharisma(updateAttribute.getCharisma());
            update.setPerception(updateAttribute.getPerception());
            this.repository.save(update);
            response = ResponseEntity.ok(update);
        } else {
            response = ResponseEntity.notFound().build();
        }
        return response;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity deleteAttribute(@PathVariable Long id) {
        ResponseEntity response;
        if(this.repository.existsById(id)) {
            repository.deleteById(id);
            response = ResponseEntity.ok("Attribute deleted successfully!");
        } else {
            response = ResponseEntity.notFound().build();
        }
        return response;
    }
}
