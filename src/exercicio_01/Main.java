package exercicio_01;

public class Main {
	
	public static void main(String[] args) {
	
	//Calculadora
		System.out.println("Exerc�cio da Calculadora:");
		Calculadora.soma(1, 4.5);
		Calculadora.subtra��o(4.5, 1);
		Calculadora.multiplica��o(2, 2);
		Calculadora.divis�o(4, 1);
		
	//Mensagem
		System.out.println("Exerc�cio da Mensagem:");
		Mensagem.mensagem(8);
		Mensagem.mensagem(13);
		Mensagem.mensagem(22);
		Mensagem.mensagem(34);
		Mensagem.mensagem(-3);
		
	//Emprestimo
		System.out.println("Exerc�cio do Empr�stimo:");
		Emprestimo.calculadora(1230.0, 12);
		Emprestimo.calculadora(1230.0, 3);
	}

	
}
