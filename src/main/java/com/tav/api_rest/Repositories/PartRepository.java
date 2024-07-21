package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Nest;
import com.tav.api_rest.Model.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PartRepository extends JpaRepository<Part, Integer> {
    @Query("select p from Part p where p.nest.id = :nest")
    List<Part> findByNstId(@Param("nest") Integer nstId);

}
