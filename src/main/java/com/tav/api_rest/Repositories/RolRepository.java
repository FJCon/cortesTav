package com.tav.api_rest.Repositories;

import com.tav.api_rest.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RolRepository extends JpaRepository<Role, Integer> {
}
