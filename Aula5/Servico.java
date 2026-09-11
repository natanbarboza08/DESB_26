// Cria a classe serviço
public class Servico {

    private String nome;
    private String categoria;

    // Cria o construtor

    public Servico(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;

    }

    public String getCategoria() {
        return categoria;
    }

    // metodo para executar

    public void executar() {
        System.out.println("Executando servico ...");
    }

}
