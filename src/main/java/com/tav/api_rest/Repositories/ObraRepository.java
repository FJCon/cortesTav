package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Obra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ObraRepository extends JpaRepository<Obra, Integer> {
    @Query("Select o from Obra o where o.parentId = 3")
    List<Obra> findObras();
}
