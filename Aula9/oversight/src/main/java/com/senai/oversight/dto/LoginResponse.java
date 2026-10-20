package com.senai.oversight.dto;

public record LoginResponse(String token, String tipo, UsuarioResponse usuario) {
} 
