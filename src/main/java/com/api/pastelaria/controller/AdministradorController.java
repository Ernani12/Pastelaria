package com.api.pastelaria.controller;

import com.api.pastelaria.model.Administrador;
import com.api.pastelaria.repository.AdministradorRepository;
import com.api.pastelaria.services.AdministradorService;

import lombok.NonNull;
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
    private AdministradorService S;

    @PostMapping("/saveEmployees")
    public ResponseEntity<String> saveEmployees(@NonNull @RequestBody List<Administrador> empData) {
        return S.saveEmployees(empData);
    }

    @GetMapping("/getEmployees")
    public List<Administrador> getEmployees(){
        return S.getEmployees();
    }
}
