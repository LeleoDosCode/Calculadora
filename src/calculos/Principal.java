package calculos;

public class Principal {

	public static void main(String[] args) {
		
		Calculos calculos = new Calculos();
		
		System.out.println("A soma é: "+calculos.somar(10, 10));
		System.out.println("A subtração é: "+calculos.sub(10, 10));
		System.out.println("A multiplicação é: "+calculos.mult(10, 10));
		System.out.println("A divisão é: "+calculos.div(10, 10));
		System.out.println("O expoente é: "+calculos.exp(10, 10));
		
	}
	
}
