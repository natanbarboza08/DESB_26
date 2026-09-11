// Cria a classe consultor herdando os parametros e metodos da classe mae pessoa
public class Consultor extends Pessoa {
    private String matricula; // Deixa a variavel matricula privado

    public Consultor(String nome, String matricula) {
        super(nome);
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    // Polimorfismo
    @Override

    public void exibirInformacoes() {
        System.out.println("=== CONSULTOR===");
        System.out.println("Nome: " + getNome());
        System.out.println("Matricula: " + matricula);

    }

}
