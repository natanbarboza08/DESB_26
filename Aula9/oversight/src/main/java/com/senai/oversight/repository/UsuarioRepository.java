package com.senai.oversight.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.oversight.models.Usuario;
import java.util.List;


// O Spring Data JPA implementa os métodos de acesso ao banco
public interface UsuarioRepository extends  JpaRepository<Usuario,Long>{
    Optional<Usuario> findByEmailIgnoreCase(String email);
    boolean existsByEmailIgnoreCase(String email);

    
} 