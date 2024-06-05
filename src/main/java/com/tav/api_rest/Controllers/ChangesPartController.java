package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.ChangesPart;
import com.tav.api_rest.Services.ChangesPartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/changes")
public class ChangesPartController {

    private ChangesPartService cngPrtServ;

    public ChangesPartController(ChangesPartService cngPrtServ){
        this.cngPrtServ= cngPrtServ;
    }

    @GetMapping
    public ResponseEntity<List<ChangesPart>> listarCambios(){
        return ResponseEntity.ok(cngPrtServ.findAllChanges());
    }
}
