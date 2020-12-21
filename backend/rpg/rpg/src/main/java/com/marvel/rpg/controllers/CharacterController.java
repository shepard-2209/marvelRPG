package com.marvel.rpg.controllers;

import com.marvel.rpg.dtos.NewCharacterDTO;
import com.marvel.rpg.dtos.UpdateCharacterDTO;
import com.marvel.rpg.entitys.Character;
import com.marvel.rpg.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    @Autowired
    CharacterRepository repository;

    @PostMapping
    public ResponseEntity createCharacter(@RequestBody NewCharacterDTO newCharacter) {
        Character character = new Character(newCharacter);
        this.repository.save(character);
        return ResponseEntity.created(null).build();
    }

    @GetMapping
    public ResponseEntity getCharacters() {
        ResponseEntity response;
        if(this.repository.count() > 0) {
            response = ResponseEntity.ok(repository);
        } else {
            response = ResponseEntity.noContent().build();
        }
        return response;
    }

    @GetMapping("/{id}")
    public ResponseEntity getCharacter(@PathVariable Long id) {
        Optional<Character> searchCharacter = this.repository.findById(id);
        ResponseEntity response;
        if(searchCharacter.isPresent()) {
            response = ResponseEntity.ok(searchCharacter.get());
        } else {
            response = ResponseEntity.notFound().build();
        }
        return response;
    }

    @PutMapping("/{id}")
    public ResponseEntity updateCharacter(@PathVariable Long id,
                                          @RequestBody UpdateCharacterDTO updateCharacter) {
        ResponseEntity response;
        if(this.repository.existsById(id)) {
            Character update = this.repository.findById(id).get();
            update.setRealName(updateCharacter.getRealName());
            update.setIdentity(updateCharacter.getIdentity());
            update.setGender(updateCharacter.getGender());
            update.setAge(updateCharacter.getAge());

            this.repository.save(update);
            response = ResponseEntity.ok(update);
        } else {
            response = ResponseEntity.notFound().build();
        }

        return response;
    }


}
