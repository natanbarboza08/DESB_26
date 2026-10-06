package com.senai.oversight.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.oversight.models.Consultor;
import com.senai.oversight.repository.ConsultorRepository;

import jakarta.transaction.Transactional;

@Service
public class ConsultorService {

    private final ConsultorRepository repository;

    public ConsultorService(ConsultorRepository repository) {
        this.repository = repository;
    }

    @Transactional
    public Consultor criar(Consultor consultor) {
        if (consultor.getNome() == null || consultor.getNome().isBlank()) {
            throw new RuntimeException("Nome é obrigatório !");
        }

        if (consultor.getEmail() == null || consultor.getEmail().isBlank()) {
            throw new RuntimeException("Email é obrigatório !");
        }

        if (consultor.getSenha() == null || consultor.getSenha().isBlank()) {
            throw new RuntimeException("Senha é obrigatória !");
        }

        if (repository.findByEmail(consultor.getEmail()).isPresent()) {
            throw new RuntimeException("Email já cadastrado");
        }

        return repository.save(consultor);
    }

    public Consultor login(String email, String senha) {
        Consultor consultor = repository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("Consultor não encontrado"));

        if (!consultor.getSenha().equals(senha)) {
            throw new RuntimeException("Senha inválida");
        }

        return consultor;
    }

    public List<Consultor> listar() {
        return repository.findAll();
    }

    public Consultor buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Consultor não encontrado"));
    }

    @Transactional
    public Consultor atualizar(Long id, Consultor dados) {
        Consultor consultor = buscarPorId(id);

        consultor.setNome(dados.getNome());
        consultor.setEmail(dados.getEmail());
        consultor.setSenha(dados.getSenha());

        return repository.save(consultor);
    }

    @Transactional
    public void excluir(Long id) {
        Consultor consultor = buscarPorId(id);
        repository.deleteById(consultor.getIdLong());
    }
}