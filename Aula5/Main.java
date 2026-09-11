// Importando as bibliotecas para trabalhar com lista

import java.util.ArrayList;
import java.util.List;

public class Main {

    // Cria a função principal

    public static void main(String[] args) {

        List<Servico> servicos = new ArrayList<>();

        Pessoa pessoa1 = new Consultor("Daniel Vieira", "CON-0095");
        Pessoa pessoa2 = new Cliente("Alpha", "CLI-001", "Industrial", "A");
        pessoa1.exibirInformacoes();
        System.out.println();
        pessoa2.exibirInformacoes();

        // Servico servico1 = new ServicoDiagnostico("Diagnostico de processos");
        // Servico servico2 = new ServicoConsultoria("Consultoria em automação");

        servicos.add(new ServicoDiagnostico("Diagnóstico de processos"));
        servicos.add(new ServicoConsultoria("Consultoria em automação"));
        servicos.add(new ServicoConsultoria("Otimização de processos"));
        // servico1.executar();
        // servico2.executar();

        for (Servico servico : servicos) {
            System.out.println("Serviço: " + servico.getNome());

            servico.executar();
            System.out.println();
        }

        // TelemetriaSucesso sucesso = new TelemetriaSucesso("Execução do serviço",
        // "Sucesso", "Relatório gerado");

        // TelemetriaErro erro = new TelemetriaErro("Execução do serviço", "Erro",
        // "Falha ao acessar o banco de dados");

        // Exemplo telemetria com polimorfismo
        Telemetria telemetria1 = new TelemetriaSucesso("Execução do serviço", "Sucesso", "Relatório gerado");
        Telemetria telemetria2 = new TelemetriaErro("Execução do serviço", "Erro", "Falha ao acessar o banco de dados");
        telemetria1.exibirTelemetria();
        telemetria2.exibirTelemetria();

    }

}
