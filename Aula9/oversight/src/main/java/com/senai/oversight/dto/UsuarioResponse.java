package com.senai.oversight.dto;

import com.senai.oversight.models.Perfil;
import com.senai.oversight.models.Usuario;

// record gerencia as informações que entra e sai da api, sem expor o banco de dados
public record UsuarioResponse(Long id, String nome, String email, Perfil perfil) {
    public static  UsuarioResponse de(Usuario u){
        return new  UsuarioResponse(u.getId(), u.getNome(),u.getEmail(),u.getPerfil());
    }
} 
