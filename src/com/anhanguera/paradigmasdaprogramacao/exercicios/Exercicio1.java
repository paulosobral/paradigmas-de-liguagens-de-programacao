package com.anhanguera.paradigmasdaprogramacao.exercicios;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int recebe1, recebe2, resultado;

		resultado = 0;

		System.out.println("Calcula a soma dos intervalos de dois n�meros:\n");

		// LE INPUT DO USU�RIO
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o primeiro n�mero:");
		recebe1 = scan.nextInt();

		System.out.println("Informe o segundo n�mero:");
		recebe2 = scan.nextInt();

		// FECHA INPUT:
		scan.close();

		// VERIFICA SE O PRIMEIRO � MAIOR:
		if (recebe1 < recebe2) {
			// VARRE DO PRIMEIRO AT� O SEGUNDO E SOMA TODOS OS INTERVALOS:
			for (int i = recebe1; i <= recebe2; i++) {

				System.out.println("Intervalo: " + i);
				resultado += i;
			}

			System.out.println("Total da soma dos intervalos: " + resultado);

		} else {

			System.out.println("O segundo deve ser maior que o primeiro!");

		}

		// SAI DO PROGRAMA:
		System.exit(0);

	}
}
