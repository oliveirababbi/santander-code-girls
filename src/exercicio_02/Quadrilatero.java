package exercicio_02;

public class Quadrilatero {
	
	public static void area (double lado) {
		
		System.out.println("A área do quadrado é " + lado * lado);
	}

	public static void area (double b, double h) {
		
		System.out.println("A área do quadrado é " + b * h);
	}

	public static void area (double B, double b, double altura) {
		
		System.out.println("A área do quadrado é " + ((b+B) * altura)/2);
	}
}
