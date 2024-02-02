package br.com.rpgrecordmanagement.rpg.repositories;

import br.com.rpgrecordmanagement.rpg.entities.Race;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceRepository extends JpaRepository<Race, Long> {
}
