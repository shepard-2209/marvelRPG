package com.marvel.rpg.repository;

import com.marvel.rpg.entitys.Attribute;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attribute,Long> {
}
