package vintetres10;

public class Navio extends Brinquedo {
    String tipoPropulsao;

    public Navio(String cor, String tipo, int velocidade, String nome, String tipoPropulsao) {
        super(cor, tipo, velocidade, nome);
        this.tipoPropulsao = tipoPropulsao;
    }

    @Override
    public void mover() {
        System.out.println(nome + " é um navio com propulsão " + tipoPropulsao + " que está navegando a " + velocidade + " nós.");
    }
}
