package com.anhanguera.paradigmasdaprogramacao.exercicios;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {

		int recebe;
		double resultado;

		resultado = 0;

		System.out.println("Calcula a série de um número:\n");

		// LE INPUT DO USUÁRIO
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um número inteiro!");
		recebe = scan.nextInt();

		// FECHA INPUT:
		scan.close();

		// VARRE DO 1 ATÉ O NÚMERO DESEJADO:
		for (int i = 1; i <= recebe; i++) {

			resultado += 1.0 / i;

		}

		System.out.println("\nTotal da série:" + resultado);

	}

}
