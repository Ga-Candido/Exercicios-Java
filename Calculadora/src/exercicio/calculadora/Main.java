package exercicio.calculadora;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	private static final Scanner Scanner = null;

	public static void main(String[] args) {
		final float numeroA = 0, numeroB = 0;
		byte escolha;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("(------------CALCULADORA--------------------)");
		System.out.println("(-------------OPERAÇÕES---------------------)");
		System.out.println(
				"(-------------(1)ADIÇÃO---------------------)\n(------------(2)SUBTRAÇÃO-------------------)\n"
						+ "(----------(3)MULTIPLICAÇÃO-----------------)"
						+ "\n(--------------(4)DIVISÃO-------------------)");
		System.out.println("(-------ESCOLHA UMA OPERAÇÃO----------------)");
		escolha = entrada.nextByte();
		
		switch (escolha) {
		case 1:
			Soma( numeroA, numeroB);
			break;

		case 2:
			SUBTRACAO(escolha, escolha);
			break;

		case 3:
			MULTIPLICAÇAO(escolha, escolha);
			break;

		case 4:
			DIVISAO(escolha, escolha);

			break;

		default:
			System.out.println("Erro ao escolher as opções");
			main(null);
			break;

		}

	}

	public static void Soma(float numeroA, float numeroB) {

		float resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quais numeros desejam somar?");
		numeroA = entrada.nextFloat();
		System.out.println("+");
		numeroB = entrada.nextFloat();
		resultado = (numeroA + numeroB);
		System.out.println("= " + resultado);
		OPCOES(entrada);

	}

	private static void SUBTRACAO(float numeroA, float numeroB) {
		float resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Qual numero deseja subtrair ?");
		numeroA = entrada.nextFloat();
		System.out.println(" - ");
		numeroB = entrada.nextFloat();
		System.out.println(numeroA + " - " + numeroB);
		resultado = (numeroA - numeroB);
		System.out.println("= " + resultado);
		OPCOES(entrada);

	}

	private static void MULTIPLICAÇAO(float numeroA, float numeroB) {
		float resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quais numeros desejam multiplicar?");
		numeroA = entrada.nextFloat();
		System.out.println("X");
		numeroB = entrada.nextFloat();
		System.out.println(numeroA + " X " + numeroB);

		resultado = (numeroA * numeroB);
		System.out.println("= " + resultado);
		OPCOES(entrada);

	}

	private static void DIVISAO(float numeroA, float numeroB) {

		float resultado;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Quais numeros desejam dividir?");
		numeroA = entrada.nextFloat();
		System.out.println("/");
		numeroB = entrada.nextFloat();
		System.out.println(numeroA + " / " + numeroB);

		resultado = (numeroA / numeroB);
		System.out.println("= " + resultado);

		OPCOES(entrada);

	}

	private static void OPCOES(Scanner entrada) {

		byte opcao;
		System.out.println("|          OPÇÕES           |");
		System.out.println("  1) - Fazer outro calculo");
		System.out.println("  2) - Sair do Progama");
		System.out.println("|                           |");
		opcao = entrada.nextByte();

		switch (opcao) {

		case 1:
			main(null);
			break;
		case 2:
			System.out.println("Progama Encerrado");
			break;
			
			default:
				break;
				
				
				

	
		}
	}
}
