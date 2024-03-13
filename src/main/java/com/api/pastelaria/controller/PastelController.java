package com.api.pastelaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
  
import com.api.pastelaria.entity.Administrador;
import com.api.pastelaria.entity.Pastel;
import com.api.pastelaria.repository.AdministradorRepository;
import com.api.pastelaria.repository.PastelRepository;

import java.util.List;

@RestController
public class PastelController {

      @Autowired   
    private PastelRepository addRepository;

    @GetMapping("/getAddress")
    public List<Pastel> getEmployees(){
        return addRepository.findAll();
    }

    @GetMapping("/")
    public String API(){ 
        return "Pastelaria"; 
    }
 
}
