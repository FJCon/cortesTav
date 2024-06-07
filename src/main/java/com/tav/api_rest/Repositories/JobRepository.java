package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface JobRepository extends JpaRepository<Job, Integer> {
    @Query("SELECT j FROM Job j JOIN FETCH j.nests n WHERE n.cnc = :cnc")
        //Se usa join fetch para que solo muestre los trabajos con el cnc que se pasa como parametro
        //En caso contrario trae el trabajo que contiene al nido con cnc = :cnc todos sus demas nidos asociados
    Job findJobByNestCnc(@Param("cnc") String cnc);
}
