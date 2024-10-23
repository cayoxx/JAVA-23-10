package vintetres10;

public class Moto extends Brinquedo {
    String cilindrada;

    public Moto(String cor, String tipo, int velocidade, String nome, String cilindrada) {
        super(cor, tipo, velocidade, nome);
        this.cilindrada = cilindrada;
    }

    @Override
    public void mover() {
        System.out.println(nome + " é uma moto com " + cilindrada + " cilindradas que está se movendo a " + velocidade + " km/h.");
    }
}

