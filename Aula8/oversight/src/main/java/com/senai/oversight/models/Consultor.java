package main.java.com.senai.oversight.models;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

// Cria tabela para relacionar com o banco de dados
@Entity 
@Table (name="consultor") // cria tabela do consultor
public class Consultor {
@Id 
@GeneratedValue (strategy = GenerationType.IDENTITY)
@Column (name = "id_consultor")
private Long idConsultor;

// Cria coluna da tabela consultor

@Column (name= "nome",nullable = false, length = 150)
private  String nome;

@Column (name = "email", nullable = false, unique = true, length = 150)
private  String email;


@Column (name = "telefone", length = 30)
private  String telefone;

// Relacionamento
@OneToMany (mappedBy = "consultor")
private List<Cliente> clientes = new ArrayList<>(); // Lista, pois o consultor pode ter varios clientes

// Cria o construtor cliente vazio, pois posso criar um cliente inicial sem passar parametros quando cria

public Consultor(){

}

// Cria outro construtor com parametros para iniciar

public Consultor(String nome, String email, String telefone){
    this.nome = nome;
    this.email = email;
    this.telefone = telefone;
}

public Long getIdLong(){
    return idConsultor;
}

public  void setIdConsultor(Long idConsultor){
    this.idConsultor = idConsultor;
}

public String getNome(){
    return  nome;
}

public void setNome(String nome){
    this.nome = nome;

}

public String getEmail(){
    return  email;
}

public void setEmail(String email){
    this.email = email;
}

public String getTelefone(){
    return telefone;
}

public  void setTelefone(){
    this.telefone = telefone;
}

public List<Cliente> getClientes(){
    return clientes;
}

public  void setClientes(List<Cliente>clientes){
    this.clientes = clientes;
}
    
}
