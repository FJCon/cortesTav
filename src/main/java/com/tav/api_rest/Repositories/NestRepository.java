package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Nest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface NestRepository extends JpaRepository<Nest,Integer> {
    @Query("select n from Nest n where n.cnc = :cnc")
    Nest findByCnc(@Param("cnc") String cnc);
}
