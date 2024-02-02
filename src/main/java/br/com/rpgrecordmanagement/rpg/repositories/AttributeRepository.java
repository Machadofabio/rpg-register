package br.com.rpgrecordmanagement.rpg.repositories;

import br.com.rpgrecordmanagement.rpg.entities.Attributes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttributeRepository extends JpaRepository<Attributes, Long> {
}
