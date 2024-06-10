package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Work;
import com.tav.api_rest.Services.WorkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/works")
public class WorkController {

    public WorkService obraServ;

    @Autowired
    public WorkController(WorkService obraServ) {
        this.obraServ = obraServ;
    }

    @GetMapping
    public ResponseEntity<List<Work>> listarObras(){
        return ResponseEntity.ok(obraServ.findAll());
    }
}
