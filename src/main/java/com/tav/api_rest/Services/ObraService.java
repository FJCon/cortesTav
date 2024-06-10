package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Obra;
import com.tav.api_rest.Repositories.ObraRepository;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@NoArgsConstructor
@Data
public class ObraService {
    private ObraRepository obraRepo;

    @Autowired
    public ObraService(ObraRepository obraRepo) {
        this.obraRepo = obraRepo;
    }

    public List<Obra> findAll(){
        return obraRepo.findObras();
    }
}
