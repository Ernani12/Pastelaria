package com.api.pastelaria.services;

import java.util.List;

import org.hibernate.boot.archive.spi.ArchiveDescriptorFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.api.pastelaria.model.Administrador;
import com.api.pastelaria.repository.AdministradorRepository;

import lombok.NonNull;

@Service
public class AdministradorService {

 

    @Autowired
    AdministradorRepository AR;

    public ResponseEntity<String> saveEmployees(@NonNull @RequestBody List<Administrador> a) {
        AR.saveAll(a);
        return ResponseEntity.ok("Data saved");
    }

    public List<Administrador> getEmployees(){
        return AR.findAll();
    }

}
