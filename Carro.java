package vintetres10;

public class Carro extends Brinquedo {
    String modelo;
    String motor;

    public Carro(String cor, String tipo, int velocidade, String nome, String modelo, String motor) {
        super(cor, tipo, velocidade, nome);
        this.modelo = modelo;
        this.motor = motor;
    }

    @Override
    public void mover() {
        System.out.println(nome + " é um carro modelo " + modelo + " com motor " + motor + " que está se movendo a " + velocidade + " km/h.");
    }
}
