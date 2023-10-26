package calculos;

public interface Calculando {
	
	public default double somar(double a, double b) {
		return 0;
		
	}
	
	public default double sub(double a, double b) {
		return 0;
		
	}
	
	public default double mult(double a, double b) {
		return 0;
		
	}
	
	public default int div(int a, int b) {
		return 0;
		
	}
	
	public default int exp(int a, int b) {
		return 0;
		
	}
}
