package com.api.pastelaria.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;
import java.util.List;

@Entity 
@Transactional
@Data
@NoArgsConstructor
@Table(name = "administrador")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adm_id")
    private Long id;
    private String adnome;
    private String addescricao;
    //address_add_id - default fk column name
    //@OneToOne(cascade = CascadeType.ALL)
    //@JoinColumn(name = "fk_add_id")

    //unidirectional one-to-many
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_adm_id",referencedColumnName = "adm_id")
    private List<Pastel> pasteis;



}
