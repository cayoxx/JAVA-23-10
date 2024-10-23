package vintetres10;

public class Brinquedo {
    String cor;
    String tipo;
    int velocidade;
    String nome;

    public Brinquedo(String cor, String tipo, int velocidade, String nome) {
        this.cor = cor;
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.nome = nome;
    }

    public void mover() {
        System.out.println(nome + " está se movendo a uma velocidade de " + velocidade + " km/h.");
    }
}



    