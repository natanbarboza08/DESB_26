package com.senaiaula06.aula06api.controller;

// Biblioteca responsavel por fazer requisição get
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestParam;

@ RestController // permite receber requisições http
public class HelloController {
    // Metódo para permitir requisição Get
    @ GetMapping("/")
    public String home(){
        return "Aula 06 - Spring boot - Desenvolvimento backend";
    }

// Rota para exibir o nome do curso
    @GetMapping("/curso")
    public String curso(){
        return "Análise e Desenvolvimento de Sistemas";
    }

    @GetMapping("/saudacao")
    public String saudacao(@RequestParam String nome){
        return "Olá " + nome + "!";
    }
    
}
