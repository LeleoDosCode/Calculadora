package calculos;

public class Calculos implements Calculando{
	
	@Override
	public double somar(double a, double b) {
		return a+b;
	}
	
	public double sub(double a, double b) {
		return a-b;
	}
	
	public double mult(double a, double b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public int exp(int a, int b) {
		return a^b;
	}
}
