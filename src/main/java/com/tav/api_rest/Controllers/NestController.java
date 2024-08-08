package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Nest;
import com.tav.api_rest.Services.NestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
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
    public ResponseEntity<Nest> buscarPorCnc(@PathVariable String id){
        return ResponseEntity.ok(nstServ.findByCnc(id));
    }

    @PutMapping("/update")
    public ResponseEntity<String> actualizarNido(@RequestBody Nest nest){

        Nest nido = nstServ.findByCnc(nest.getCnc());
        if (nido != null){
            nido.setData1(nest.getData1());
            nstServ.saveNest(nido);
            return ResponseEntity.ok("Nido actualizado con éxito");
        }else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontro el nido con id: " + nest.getId());
        }
    }
}
