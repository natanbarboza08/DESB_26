public class CalculadoraNotas {

    public static double calcularMedia(double nota1, double nota2){
        return (nota1+nota2)/2;
    }

    public static String verificarSituacao(double media){
        if(media >=7){
            return "Aprovado";
        }
        else if(media >=5){
            return "Recuperação";
        }
        else{
            return "Reprovado";
        }
    }

    public static void exibirResultado(String nome, double media, String situacao){
        System.out.println("Aluno: " + nome);
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);
    }

    public static void main(String[] args) {
        String nome = "Mariana";
        double nota1 = 5.0;
        double nota2 = 9.0;
        double media = calcularMedia(nota1, nota2);
        String situacao = verificarSituacao(media);
        exibirResultado(nome, media, situacao);
    }

}
