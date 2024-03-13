package com.api.pastelaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.pastelaria.model.Administrador;

public interface AdministradorRepository extends JpaRepository<Administrador, Long> {
}
