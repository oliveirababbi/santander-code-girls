package exercicio_01;

public class Emprestimo {
	
	public static double getTaxasAte6Parcelas () {
		return 0.6;
	}
	
	public static double getTaxasAcimaDe6Parcelas () {
		return 1.2;
	}
	
	public static void calculadora (double valor, int parcelas) {
		double valorFinal = 0;
		if (parcelas <= 6) {
			valorFinal = valor * (valor * getTaxasAte6Parcelas());
		} else if (parcelas > 6) {
			valorFinal = valor * (valor * getTaxasAcimaDe6Parcelas());
		}
		
		System.out.println("O valor do empréstimo é de R$" +valor+ ";\nParcelamento em " +parcelas+ "x;\nTotal a pagar é R$" +valorFinal);
	}
}
