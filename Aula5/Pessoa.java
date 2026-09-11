public class Pessoa {
    private String nome;
    // construtor

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
    }
}
