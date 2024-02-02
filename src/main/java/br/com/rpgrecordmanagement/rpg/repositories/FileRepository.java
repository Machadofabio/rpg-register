package br.com.rpgrecordmanagement.rpg.repositories;

import br.com.rpgrecordmanagement.rpg.entities.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {

    List<File> findAllByPlayerId(Long playerId);
}
