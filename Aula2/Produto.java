package Aula2;

public class Produto {
    String nome;
    double preco;
    int quantidade;

    public void mostrarDetalhes() {
        System.out.println("Produto: " + nome + ", Valor: " + preco);
}

public void main(String[] args) {
    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 2500.00;
    p1.mostrarDetalhes();
}
}