package Aula2;

public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        meuCarro.marca = "Fiat";
        meuCarro.cor = "Vermelho";
        System.out.println("Marca: " + meuCarro.marca + " Cor: " + meuCarro.cor);
        meuCarro.buzinar();
    }
}
