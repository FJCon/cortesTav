package com.tav.api_rest.Services;

import com.tav.api_rest.Model.ChangesPart;
import com.tav.api_rest.Repositories.ChangesRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class ChangesPartService {

    private ChangesRepository cngPrtRepo;

    @Autowired
    public ChangesPartService(ChangesRepository cngPrtRepo){
        this.cngPrtRepo =  cngPrtRepo;
    }

    public List<ChangesPart> findAllChanges() {
        return cngPrtRepo.findAll();
    }
}
