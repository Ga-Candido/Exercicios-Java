package exercicio.whilepratica;

import java.util.Scanner;

public class Main {
	static Scanner input = new Scanner(System.in);
	/*
	 * 4. Programa em Java que calcula a média das notas de uma turma Escreva um
	 * programa que pergunte ao usuário quantos alunos tem na sala dele. Em seguida,
	 * através de um laço while, pede ao usuário para que entre com as notas de
	 * todos os alunos da sala, um por vez.
	 */

	public static void main(String[] args) {
		byte alunos, notas = 0;
		System.out.println("Quanto alunos tem em sua turma?");
		alunos = input.nextByte();

		while (notas <= alunos) {

			System.out.println("Informe as notas dos alunos");
			notas = input.nextByte();
			notas++;
			
		}
		System.out.println(notas);
		
		

	}
}
