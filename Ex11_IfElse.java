/* 11- Faça um programa que receba três inteiros e 
 * diga qual deles é o maior.*/

package exerciciosJava;

import java.util.Scanner;

public class Ex11_IfElse {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int n1, n2, n3;

		System.out.println("Digite o primeiro número 1 ");

		n1 = leia.nextInt();

		System.out.println("Digite o primeiro número 2 ");

		n2 = leia.nextInt();

		System.out.println("Digite o primeiro número 3 ");

		n3 = leia.nextInt();

		if (n1 > n2) {

			System.out.println("O maior e " + n1);

		}

		else if (n2 > n3) {

			System.out.println(" E o numero maior" + n2);

		}

		else if (n3 > n1) {

			System.out.println(" E o numero menor" + n3);

		}

	}

}