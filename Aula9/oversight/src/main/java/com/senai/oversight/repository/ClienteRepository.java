package com.senai.oversight.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.oversight.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}