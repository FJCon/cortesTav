package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Nest;
import com.tav.api_rest.Services.NestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/nests")
public class NestController {

    private NestService nstServ;

    @Autowired
    public NestController(NestService nstServ){
        this.nstServ = nstServ;
    }

    @GetMapping
    public ResponseEntity<List<Nest>> listarNidos(){
        return ResponseEntity.ok(nstServ.findAllNests());
    }

    @GetMapping("/cnc/{id}")
    public ResponseEntity<Nest> buscarPorCnc(@PathVariable String cnc){
        return ResponseEntity.ok(nstServ.findByID(cnc));
    }
}
