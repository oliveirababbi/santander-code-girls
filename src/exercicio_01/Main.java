package exercicio_01;

public class Main {
	
	public static void main(String[] args) {
	
	//Calculadora
		System.out.println("Exercício da Calculadora:");
		Calculadora.soma(1, 4.5);
		Calculadora.subtração(4.5, 1);
		Calculadora.multiplicação(2, 2);
		Calculadora.divisão(4, 1);
		
	//Mensagem
		System.out.println("Exercício da Mensagem:");
		Mensagem.mensagem(8);
		Mensagem.mensagem(13);
		Mensagem.mensagem(22);
		Mensagem.mensagem(34);
		Mensagem.mensagem(-3);
		
	//Emprestimo
		System.out.println("Exercício do Empréstimo:");
		Emprestimo.calculadora(1230.0, 12);
		Emprestimo.calculadora(1230.0, 3);
	}

	
}
