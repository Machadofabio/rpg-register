package br.com.rpgrecordmanagement.rpg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.util.List;

@Entity
public class Race {
    @Id
    @Column(name = "RACE_ID")
    private Long raceId;

    @Column(name = "RACE_NAME")
    private String raceName;
    @ManyToOne
    private List<Attributes> attributes;
}
