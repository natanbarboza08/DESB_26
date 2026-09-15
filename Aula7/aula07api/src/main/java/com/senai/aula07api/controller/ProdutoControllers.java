package com.senai.aula07api.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.senai.aula07api.models.*;
import java.util.ArrayList;
import java.util.List;

@RestController // RestController é um metodo que indica que a classe irá receber requisiçoes http

// Rota produtos
@RequestMapping("/produtos")
public class ProdutoControllers {
    
    // Lista que simula um banco de dados

    private List<Produto> produtos = new ArrayList<>();

    // Cria um construtor para ProdutoControllers

    public ProdutoControllers(){
        produtos.add(new Produto(1, "Notebook", 3500));

        produtos.add(new Produto(2, "Mouse", 100));

        produtos.add(new Produto(3, "Teclado", 250));
    
    }

    // ==================================================================================================================
    // Cria metodo get para listar todos os produtos
    // ==================================================================================================================

    @GetMapping
    public List<Produto> listarProdutos(){
        return produtos;
    }

    // ==================================================================================================================
    // Cria metodo get para listar os produtos por id
    // ==================================================================================================================

    @GetMapping("/{id}")
    public Produto buscarProduto(@PathVariable int id){
        for(Produto produto:produtos){
            if(produto.getId()==id){
                return produto;
            }

        }
        return null;
    }

    // ==================================================================================================================
    // Post para cadastrar um produto
    // ==================================================================================================================

    @PostMapping 
    public Produto cadastrarProduto(@RequestBody Produto produto){
        produtos.add(produto);
        return produto;

    }

    // ==================================================================================================================
    // Put para atualizar produto
    // ==================================================================================================================
    @PutMapping("/{id}")
    public Produto atualizarProduto(@PathVariable int id, @RequestBody Produto produtoatualizado){
        for(Produto produto: produtos){
            if(produto.getId() == id){
                produto.setNome(produtoatualizado.getNome());
                produto.setPreco(produtoatualizado.getPreco());
            }
        }
        return null;
    }

    // ==================================================================================================================
    // Delete para excluir produto pelo id
    // ==================================================================================================================
    @DeleteMapping("/{id}")
    public String excluirProduto(@PathVariable int id){
        for(Produto produto:produtos){
            if(produto.getId()==id){
                produtos.remove(produto);
                return "Produto removido com sucesso";
            }
        }

        return "Produto não encontrado.";
    }
}
