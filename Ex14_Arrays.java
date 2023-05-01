/*Faça um programa que crie um vetor por leitura com 
 * 5 valores de pontuação de uma atividade e o escreva em seguida. 
 * Encontre após a maior pontuação e a apresente.
*/

package exerciciosJava;

import java.util.Scanner;

public class Ex14_Arrays {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int contagem = 5;
		double maiorPontuacao = 0;
		double[] pontuacao = new double[contagem];

		for (int i = 0; i < contagem; ++i) {

			System.out.println("Qual a pontuação do " + (i + 1) + "?");

			pontuacao[i] = input.nextDouble();

			System.out.println(pontuacao[i]);

			if (maiorPontuacao < pontuacao[i]) {
				maiorPontuacao = pontuacao[i];

			}
		}
		System.out.println("A maior pontuação é : " + maiorPontuacao);

	}
}
