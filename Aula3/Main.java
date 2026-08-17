import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");

        String nome = sc.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        double media = (nota1 + nota2)/2;
        System.out.println("\n Aluno: " + nome);
        System.out.println("\n Média: " + media);

        if (media>=7){
            System.out.println("Situação: Aprovado");
        }

        else if(media>=5){
            System.out.println("Situação: Recuperação");
        }
        else{
            System.out.println("Situação: Reprovado");
        }
        sc.close();


    }

}