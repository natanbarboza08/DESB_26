package Aula4;
/*
  Modelo de dominio do Projeto CTI Insights
  Nesta etapa usamos os anos de experiência para demonstrar um setter com comparação numerica
*/


public class Consultor {

    // Encapsulamento: os daos ficam protegidos
    private String codigo;
    private String nome;
    private int anosExperiencia;


    /*
       Construtor: cria um consultor com os dados iniciais
    */
    public Consultor(String codigo, String nome, int anosExperiencia){
        setCodigo(codigo);
        setNome(nome);
        setAnosExperiencia(anosExperiencia);
    }


    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }


    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getAnosExperiencia(){
        return anosExperiencia;
    }

    /*
     Setter com regra simples: a experiencia nao pode ser negativa
    */


     public void setAnosExperiencia(int anosExperiencia){
        if(anosExperiencia >=0){
            this.anosExperiencia = anosExperiencia;
        } else{
            System.out.println("Erro: anos de experiência não podem ser negativos");
        }
     }


     public void exibirResumo(){
        System.out.println("\n --- Resumo do consultor --- ");
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Anos de experiência: " + anosExperiencia);
     }
    
}

