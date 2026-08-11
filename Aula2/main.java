package Aula2;

public class main {
    public static void main(String[] args) {
        carro meuCarro = new carro();

        meuCarro.marca = "Fiat";
        meuCarro.cor = "Vermelho";
        System.out.println("Marca: " + meuCarro.marca + " Cor: " + meuCarro.cor);
        meuCarro.buzinar();
    }
}
