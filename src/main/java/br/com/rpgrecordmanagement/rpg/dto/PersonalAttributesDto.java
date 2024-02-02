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
public class PersonalAttributesDto {
    private String name;
    private Integer level;
    private Integer totalLifePoints;
    private Integer lifePoints;
    private Integer totalManaPoints;
    private Integer manaPoints;
    private String race;
    private String origin;
    private String characterClass;
    private String divinity;
    private PhysicalAndMentalAttributesDto physicalAndMentalAttributesDto;

}
