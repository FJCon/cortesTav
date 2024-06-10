package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Work;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WorkRepository extends JpaRepository<Work, Integer> {
    @Query("Select w from Work w where parentId=3 order by w.nodeName")
    List<Work> findObras();
}
