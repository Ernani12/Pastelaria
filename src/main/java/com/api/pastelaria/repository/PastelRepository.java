package com.api.pastelaria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.pastelaria.model.Pastel;

public interface PastelRepository extends JpaRepository<Pastel, Long> {
}
