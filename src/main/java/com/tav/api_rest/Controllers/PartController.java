package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Part;
import com.tav.api_rest.Services.PartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/parts")
public class PartController {

    private PartService partSev;

    @Autowired
    public PartController(PartService partSev){
        this.partSev = partSev;
    }

    @GetMapping
    public ResponseEntity<List<Part>> listarPartes(){
        return ResponseEntity.ok(partSev.listParts());
    }

    @GetMapping("/nest/{id}")
    public ResponseEntity<List<Part>> listarPorNstId(@PathVariable Integer id){
        return ResponseEntity.ok(partSev.listByNstId(id)) ;
    }

}