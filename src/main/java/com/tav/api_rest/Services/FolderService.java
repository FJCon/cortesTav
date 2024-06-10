package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Folder;
import com.tav.api_rest.Repositories.FolderRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@Data
public class FolderService {
    private FolderRepository folderRepo;

    @Autowired
    public FolderService(FolderRepository folderRepo) {
        this.folderRepo = folderRepo;
    }

    public List<Folder> findFolders(){
        return folderRepo.findAll();
    }

    public List<Folder> findByBwsrId(Integer id){
        return folderRepo.findByBwsrId(id);
    }
}
