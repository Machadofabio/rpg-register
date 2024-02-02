package br.com.rpgrecordmanagement.rpg.service;

import br.com.rpgrecordmanagement.rpg.dto.FilesDto;
import br.com.rpgrecordmanagement.rpg.entities.File;
import br.com.rpgrecordmanagement.rpg.repositories.FileRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class FilesAttributeService {
    private final FileRepository fileRepository;

    public List<FilesDto> getFiles(Long userId) {
        List<FilesDto> files = new ArrayList<>();
        List<File> foundedFiles = fileRepository.findAllByPlayerId(userId);
        if(!foundedFiles.isEmpty()){
            foundedFiles.forEach(file -> {
                files.add(FilesDto.builder()
                        .id(file.getId())
                        .characterName(file.getCharacterName()).build());
            });
        }

        return files;
    }
}
