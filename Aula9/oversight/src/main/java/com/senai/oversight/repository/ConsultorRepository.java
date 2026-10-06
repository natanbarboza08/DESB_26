package com.senai.oversight.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.oversight.models.Consultor;

public interface ConsultorRepository extends JpaRepository<Consultor, Long> {
    Optional<Consultor> findByEmail(String email);
}