package com.anhanguera.paradigmasdaprogramacao.exercicios;

import java.util.Scanner;

public class Exercico2 {

	public static void main(String[] args) {

		int recebe;
		double resultado;

		resultado = 0;

		System.out.println("Calcula a s�rie de um n�mero:\n");

		// LE INPUT DO USU�RIO
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe um n�mero inteiro!");
		recebe = scan.nextInt();

		// FECHA INPUT:
		scan.close();

		// VARRE DO 1 AT� O N�MERO DESEJADO:
		for (int i = 1; i <= recebe; i++) {

			resultado += 1.0 / i;

		}

		System.out.println("\nTotal da s�rie:" + resultado);

	}

}
