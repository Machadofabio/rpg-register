package br.com.rpgrecordmanagement.rpg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FilesDto {
    private Long id;
    private Long characterName;
    private Long level;
    private LocalDate initCampaignDate;
    private String characterClass;
    private Integer playersQuantity;
}
