package Aula4;

public class Main {

    public static void main (String [] args){
        System.out.println("=== CTI Insights Aula 04");

        // Etapa 1 criar um objeto da classe consultor

        // O objeto representa a pessoa responsável pelo atendimento
        Consultor  consultor = new Consultor(
            "CON-0095", "Daniel Vieira", 10);

            // Etapa 02 : Criar um objeto da classe Serviço

            // O serviço começa ativo porque é regra do construtor

        Servico servico = new Servico(
                "SER-001", "Diagnostico de processos", "Analise dos processos iniciais da empresa");


       // Etapa 3 Criar um objeto da classe Cliente

       // O ultimo argumento é o objeto consultor criado na etapa 1
       // Assim, o cliente fica ligado ao consultor responsavel


       Cliente cliente = new Cliente(
        "CTI-001", "Comercio", 1, "Entre R$ 1 e R$ 10 milhoes", consultor);



        // Etapa 4 Usar os getters para consultar as informações

        System.out.println("\n ----- Objetos criados --- ");
        System.out.println("Código do cliente: " + cliente.getCodigoCti());
        System.out.println("Nome do consultor: " + consultor.getNome());
        System.out.println("Nome do serviço: " + servico.getNome());

        // Etapa 05 Testar um valor invalido no setter do Cliente

        System.out.println("\n --- Teste de nível invalido --- ");
        cliente.setNivel(4);
        System.out.println("Nível mantido: " + cliente.getNivel());


        // Etapa 06 Testar um valor valido no setter do Cliente

        System.out.println("\n --- Teste de nível valido --- ");
        cliente.setNivel(2);
        System.out.println("Novo nível: " + cliente.getNivel());


        // Etapa 07 Testar a regra do setter do Consultor
        // Anos de experiência não podem ser negativo

        System.out.println("\n --- Teste de experiência invalida --- ");
        consultor.setAnosExperiencia(-2);
        System.out.println("Experiência mantida: " + consultor.getAnosExperiencia() + " anos");


        // Etapa 08 : Testar os métodos de negocio da classe Servico
        // Não usamos setAtivo, usamos ações com nomes claros
        System.out.println("Serviço ativo no inicio ? " + servico.isAtivo());

        servico.desativar();
        System.out.println("Depois de desativar: " + servico.isAtivo());
        servico.ativar();
        System.out.println("Depois de ativar: " + servico.isAtivo());


        // Etapa 09 Criar um relatório com getters


        System.out.println("\n --- Relatório Final --- ");
        System.out.println("Código CTI: " + cliente.getCodigoCti());
        System.out.println("Segmento: " + cliente.getSegmento());
        System.out.println("Nivel: " + cliente.getNivel());
        System.out.println("Faixa de faturamento: " + cliente.getFaixaFaturamento());
        System.out.println("Consultor responsável: " + cliente.getConsultorResponsavel().getNome());
        System.out.println("Serviço escolhido: " + servico.getNome());
        System.out.println("Serviço ativo ? " + servico.isAtivo());

        System.out.println("\n Exemplo concluido");






    }
    
}