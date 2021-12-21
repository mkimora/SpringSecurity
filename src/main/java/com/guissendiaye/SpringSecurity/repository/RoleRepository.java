package com.guissendiaye.SpringSecurity.repository;

import com.guissendiaye.SpringSecurity.models.ERole;
import com.guissendiaye.SpringSecurity.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
