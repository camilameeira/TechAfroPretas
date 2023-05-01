/*10. Faça um programa que pegue um número do teclado 
 * e calcule a soma de todos os números  de 1 até ele. 
 * Ex.: o usuário entra 7, o programa vai 
 * mostrar 28, pois  1+2+3+4+5+6+7=28. */

package exerciciosJava;

import java.util.Scanner;

public class Ex10_doWhile {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int numero, somaNumero = 0, x = 1;

		System.out.println("Qual o número ? ");
		numero = ler.nextInt();

		if (numero < 10) {
			do {
				somaNumero += numero;
				numero--;
			} while (numero >= x);
			System.out.println("\nA soma é : " + somaNumero);
		} else {
			System.out.println("\nSomente número entre 1 a 9");

		}

	}

}
