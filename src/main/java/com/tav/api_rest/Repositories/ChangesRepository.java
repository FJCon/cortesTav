package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.ChangesPart;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChangesRepository extends JpaRepository<ChangesPart, Integer> {
}
