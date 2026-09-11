public class ServicoConsultoria extends Servico {
    // construtor
    public ServicoConsultoria(String nome) {
        super(nome, "Consultoria");
    }

    @Override
    public void executar() {
        System.out.println("Executando consultoria especializada " + getNome());
    }

}
