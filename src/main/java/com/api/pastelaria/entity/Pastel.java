package com.api.pastelaria.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;
import jakarta.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name = "pastel")
public class Pastel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "p_id")
    private Long p_id;
    private String nome;
    private String descricao;

    // for bidirectional one to one mapping
    //@OneToOne(mappedBy = "address")
    //private Employee employee;

    @ManyToOne
    @JoinColumn(name = "fk_adm_id")
    private Administrador adm;
}
