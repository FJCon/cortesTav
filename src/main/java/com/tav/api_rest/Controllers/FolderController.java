package com.tav.api_rest.Controllers;

import com.tav.api_rest.Model.Folder;
import com.tav.api_rest.Services.FolderService;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/folders")
@CrossOrigin(origins = "*")
public class FolderController {

    private FolderService folderServ;

    @Autowired
    public FolderController(FolderService folderServ) {
        this.folderServ = folderServ;
    }

    @GetMapping
    public ResponseEntity<List<Folder>> encontrarProyectos(){
        return ResponseEntity.ok(folderServ.findFolders());

    }
    @GetMapping("/{id}")
    public ResponseEntity<List<Folder>> encontrarPorId(@PathVariable Integer id){
        return ResponseEntity.ok(folderServ.findByBwsrId(id));
    }
}
