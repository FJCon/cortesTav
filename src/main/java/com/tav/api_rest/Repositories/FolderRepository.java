package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FolderRepository extends JpaRepository<Folder,Integer> {
    @Query("Select f from Folder f JOIN FETCH f.jobs j where f.bwsrId = :id ")
    List<Folder> findByBwsrId(@Param("id") Integer id);
}
