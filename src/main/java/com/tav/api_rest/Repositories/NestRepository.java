package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Nest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NestRepository extends JpaRepository<Nest,Integer> {
    public Nest findByCnc(String cnc);
}
