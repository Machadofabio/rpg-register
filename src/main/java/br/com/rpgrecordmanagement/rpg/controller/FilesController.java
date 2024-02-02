package br.com.rpgrecordmanagement.rpg.controller;

import br.com.rpgrecordmanagement.rpg.dto.FilesAttributeDto;
import br.com.rpgrecordmanagement.rpg.dto.FilesDto;
import br.com.rpgrecordmanagement.rpg.service.FilesAttributeService;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/files")
public class FilesController {

    private FilesAttributeService filesAttributeService;

    @GetMapping("/attributes")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "Get files attributes successfully",
                    content = @Content(mediaType = "application/json", schema = @Schema(implementation = FilesAttributeDto.class))),
            @ApiResponse(responseCode = "500", description = "Server error")})
    public ResponseEntity<List<FilesDto>> getFilesAttribute(@RequestParam Long userId){
        return ResponseEntity.ok(filesAttributeService.getFiles(userId));
    }

}
