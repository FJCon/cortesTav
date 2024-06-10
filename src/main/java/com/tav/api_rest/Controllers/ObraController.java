package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Obra;
import com.tav.api_rest.Services.ObraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/works")
public class ObraController {

    public ObraService obraServ;

    @Autowired
    public ObraController(ObraService obraServ) {
        this.obraServ = obraServ;
    }

    @GetMapping
    public ResponseEntity<List<Obra>> listarObras(){
        return ResponseEntity.ok(obraServ.findAll());
    }
}
