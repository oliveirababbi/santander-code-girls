package exercicio_02;

public class Quadrilatero {
	
	public static void area (double lado) {
		
		System.out.println("A �rea do quadrado � " + lado * lado);
	}

	public static void area (double b, double h) {
		
		System.out.println("A �rea do quadrado � " + b * h);
	}

	public static void area (double B, double b, double altura) {
		
		System.out.println("A �rea do quadrado � " + ((b+B) * altura)/2);
	}
}
