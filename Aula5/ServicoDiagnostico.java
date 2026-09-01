public class ServicoDiagnostico extends Servico {

    public ServicoDiagnostico(String nome) {
        super(nome, "Diagnóstico");

    }

    @Override
    public void executar() {
        System.out.println("Executando diagnóstico do cliente " + getNome());
    }

}
