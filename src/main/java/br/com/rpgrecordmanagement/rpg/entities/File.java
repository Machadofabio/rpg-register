package br.com.rpgrecordmanagement.rpg.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "TB_FILE")
public class File {
    @Id
    @Column(name = "FILE_ID")
    private Long id;

    @Column(name = "CHAR_NAME")
    private Long characterName;

    @OneToMany
    private Player player;
}
