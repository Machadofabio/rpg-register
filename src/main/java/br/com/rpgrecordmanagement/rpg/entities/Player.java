package br.com.rpgrecordmanagement.rpg.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_CDSTRO")
public class Player {

    @Id
    @Column(name = "PLAYER_ID")
    private Long id;

    @ManyToOne
    private File file;
}
