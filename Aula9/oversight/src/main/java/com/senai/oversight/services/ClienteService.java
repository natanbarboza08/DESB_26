package com.senai.oversight.services;

import org.springframework.stereotype.Service;

import com.senai.oversight.models.Cliente;
import com.senai.oversight.models.Consultor;
import com.senai.oversight.repository.ClienteRepository;
import com.senai.oversight.repository.ConsultorRepository;

import jakarta.transaction.Transactional;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;
    private final ConsultorRepository consultorRepository;

    public ClienteService(ClienteRepository clienteRepository, ConsultorRepository consultorRepository) {
        this.clienteRepository = clienteRepository;
        this.consultorRepository = consultorRepository;
    }

    @Transactional
    public Cliente criar(Long idConsultor, Cliente cliente) {
        Consultor consultor = consultorRepository.findById(idConsultor)
                .orElseThrow(() -> new RuntimeException("Consultor não encontrado"));

        if (cliente.getNomeEmpresa() == null || cliente.getNomeEmpresa().isBlank()) {
            throw new RuntimeException("Nome da empresa é obrigatório");
        }

        if (cliente.getSegmento() == null || cliente.getSegmento().isBlank()) {
            throw new RuntimeException("Segmento é obrigatório");
        }

        if (cliente.getFaturamentoAnual() == null) {
            throw new RuntimeException("Faturamento anual é obrigatório");
        }

        cliente.setConsultor(consultor);

        return clienteRepository.save(cliente);
    }

    public Cliente buscarporId(Long id) {
        return clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));
    }

    @Transactional
    public Cliente atualizar(Long id, Cliente dados) {
        Cliente cliente = buscarporId(id);

        cliente.setNomeEmpresa(dados.getNomeEmpresa());
        cliente.setSegmento(dados.getSegmento());
        cliente.setFaturamentoAnual(dados.getFaturamentoAnual());
        cliente.setNivel(dados.getNivel());
        cliente.setStatus(dados.getStatus());

        return clienteRepository.save(cliente);
    }

    @Transactional
    public void excluir(Long id) {
        Cliente cliente = buscarporId(id);
        clienteRepository.deleteById(cliente.getIdCliente());
    }
}