package com.api.pastelaria.controller;

import com.api.pastelaria.entity.Administrador;
import com.api.pastelaria.entity.Pastel;
import com.api.pastelaria.repository.AdministradorRepository;
import com.api.pastelaria.repository.PastelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AdministradorController {


    @Autowired
    private AdministradorRepository empRepository;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@RequestBody List<Administrador> empData) {
        empRepository.saveAll(empData);
        return ResponseEntity.ok("Data saved");
    }

    @GetMapping("/getEmployees")
    public List<Administrador> getEmployees(){
        return empRepository.findAll();
    }
}
