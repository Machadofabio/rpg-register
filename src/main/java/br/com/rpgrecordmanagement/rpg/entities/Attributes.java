package br.com.rpgrecordmanagement.rpg.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_ATTRBT")
public class Attributes {
    @Id
    @Column(name = "ATTRBT_ID")
    private Long id;

    @Column(name = "ATTRBT_DESCRPT")
    private String description;
}
