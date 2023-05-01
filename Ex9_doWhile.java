/*/*Faça um programa que mostre uma contagem na tela de 233 
 * a 456, só que contando de 3 em 3 quando estiver entre 300 e 
 * 400 e de 5 em 5 quando não estiver.*/

package exerciciosJava;

import java.util.Scanner;

public class Ex9_doWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero = 233;

		do {

			if (numero >= 300 && numero <= 400) {

				numero += 3;

				System.out.println("Somando de 3 em 3" + numero);

			} else {

				numero += 5;

				System.out.println("Somando de 5 em 5" + numero);

			}

		} while (numero <= 456);

	}

}
