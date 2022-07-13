package exercicio_03;

public class Quadrilatero {

public static double area (double lado) {
		
		return lado * lado;
	}

	public static double area (double b, double h) {
		
		return b * h;
	}

	public static double area (double B, double b, double altura) {
		
		return ((b+B) * altura)/2;
	}
}
