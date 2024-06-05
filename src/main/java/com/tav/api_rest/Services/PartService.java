package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Part;
import com.tav.api_rest.Repositories.PartRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Data
public class PartService {

    private PartRepository partRepo;

    @Autowired
    public PartService(PartRepository partRepo){
        this.partRepo=partRepo;
    }
    public List<Part> listParts() {
        return partRepo.findAll();
    }
}
