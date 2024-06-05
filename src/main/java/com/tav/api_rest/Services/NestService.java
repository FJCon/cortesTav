package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Nest;
import com.tav.api_rest.Repositories.NestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NestService {

    private NestRepository nstRepo;

    @Autowired
    public NestService(NestRepository nstRepo){
        this.nstRepo = nstRepo;
    }

    public List<Nest> findAllNests(){
        return nstRepo.findAll();
    }

    public Nest findByID(String cnc){
        return nstRepo.findByCnc(cnc);
    }
}
