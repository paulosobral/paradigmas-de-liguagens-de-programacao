package com.anhanguera.paradigmasdaprogramacao.exercicios;

import java.util.Scanner;

public class ExercicioTempo {

	public static void main(String[] args) {

		int horaInicial, horaFinal, minutoInicial, minutoFinal, tempoDeJogo, totalHoras, totalMinutos;

		horaInicial = horaFinal = minutoInicial = minutoFinal = tempoDeJogo = totalHoras = totalMinutos = 0;

		System.out.println("Calcula a diferença de dois horários de jogo (início e termino):\n");

		// LE INPUT DO USUÁRIO
		Scanner scan = new Scanner(System.in);

		// RECEBE OS VALORES:
		System.out.println("Informe a hora que você começou a jogar:");
		horaInicial = scan.nextInt();

		System.out.println("Informe o minuto que você começou a jogar:");
		minutoInicial = scan.nextInt();

		System.out.println("Informe a hora que você terminou de jogar:");
		horaFinal = scan.nextInt();

		System.out.println("Informe o minuto que você terminou de jogar:");
		minutoFinal = scan.nextInt();

		// FECHA INPUT:
		scan.close();

		// VALIDA HORA HORA E MINUTO, SE INFERIORES A ZERO SAI DO PROGRAMA:
		if (horaInicial < 0 || minutoInicial < 0 || horaFinal < 0
				|| minutoFinal < 0) {

			System.out.println("Informe corretamente as horas e minutos!");

		}
		// CASO TUDO OK
		else {

			// CONVERTE TUDO PARA SEGUNDOS:
			horaInicial *= 3600;
			horaFinal *= 3600;

			minutoInicial *= 60;
			minutoFinal *= 60;

			// VERIFICA SE A HORA INICIAL É MENOR OU IGUAL A HORA FINAL:
			if (horaInicial > horaFinal) {

				// ADICIONA MAIS 24 HORAS EM SEGUNDOS PARA RETIRAR A DIFERENÇA
				// DE
				// MINUTOS:
				horaFinal += (3600 * 24);

			}

			// REALIZA O TEMPO DE DIFERENÇA ENTRE OS HORÁRIOS:
			tempoDeJogo = (horaFinal + minutoFinal)
					- (horaInicial + minutoInicial);

			// CONVERTE TUDO PARA HORA E MINUTO NOVAMENTE:
			totalHoras = tempoDeJogo / 3600;
			totalMinutos = (tempoDeJogo % 3600) / 60;

			System.out.println("Tempo total de jogo: " + totalHoras
					+ " horas e " + totalMinutos + " minutos.");
		}

		// SAI DO PROGRAMA:
		System.exit(0);

	}

}
