package vintetres10;

public class PrincipalBrinquedo {
	    public static void main(String[] args) {
	    	
	        Carro carro = new Carro("Vermelho", "Carro", 150, "Ferrari", "F8 Tributo", "V8");
	        System.out.println("Carro:");
	        System.out.println("Cor: " + carro.cor);
	        System.out.println("Tipo: " + carro.tipo);
	        System.out.println("Velocidade: " + carro.velocidade);
	        System.out.println("Nome: " + carro.nome);
	        System.out.println("Modelo: " + carro.modelo);
	        System.out.println("Motor: " + carro.motor);
	        carro.mover();
	        
	        Moto moto = new Moto("Preta", "Moto", 180, "Harley", "1200 cc");
	        System.out.println("\nMoto:");
	        System.out.println("Cor: " + moto.cor);
	        System.out.println("Tipo: " + moto.tipo);
	        System.out.println("Velocidade: " + moto.velocidade);
	        System.out.println("Nome: " + moto.nome);
	        System.out.println("Cilindrada: " + moto.cilindrada);
	        moto.mover();
	        
	        Navio navio = new Navio("Branco", "Navio", 30, "Titanic", "Vapor");
	        System.out.println("\nNavio:");
	        System.out.println("Cor: " + navio.cor);
	        System.out.println("Tipo: " + navio.tipo);
	        System.out.println("Velocidade: " + navio.velocidade);
	        System.out.println("Nome: " + navio.nome);
	        System.out.println("Tipo de Propulsão: " + navio.tipoPropulsao);
	        navio.mover();
	    }
	}

