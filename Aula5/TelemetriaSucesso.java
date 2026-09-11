public class TelemetriaSucesso extends Telemetria {
    private String resultado;

    public TelemetriaSucesso(
            String evento, String status, String resultado) {
        super(evento, status);
        this.resultado = resultado;

    }

    // Cria um metodo
    public String getResultado() {
        return resultado;
    }

    // polimorfismo

    @Override
    public void exibirTelemetria() {
        super.exibirTelemetria();
        System.out.println("Resultado: " + resultado);
        System.out.println("Execução realizada com sucesso");
    }

}
