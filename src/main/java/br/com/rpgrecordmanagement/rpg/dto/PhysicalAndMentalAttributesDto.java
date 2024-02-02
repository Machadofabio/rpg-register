package br.com.rpgrecordmanagement.rpg.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PhysicalAndMentalAttributesDto {
    private Integer strength;
    private Integer dexterity;
    private Integer constitution;
    private Integer inteligency;
    private Integer wisdom;
    private Integer charisma;

}
