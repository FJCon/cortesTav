package com.tav.api_rest.Services;

import com.tav.api_rest.Model.Role;
import com.tav.api_rest.Repositories.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepo;

    public List<Role> listarRoles(){
        return rolRepo.findAll();
    }


}
