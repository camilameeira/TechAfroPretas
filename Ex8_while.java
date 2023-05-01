/*8. Obtenha um número digitado pelo usuário e repita 
 * a operação de multiplicar ele por três  
 * (imprimindo o novo valor) até que ele seja 
 * maior do que 100. Ex.: se o usuário digita 5,  
 * deveremos observar na tela a seguinte sequência: 5 15 45 135.*/

package exerciciosJava;

import java.util.Scanner;

public class Ex8_while {

	public static void main(String[] args) {

	  	    Scanner ler = new Scanner(System.in);       

	        double numero , multiplicador = 3 , valor;

	        System.out.println("Qual o numero ? ");

	        numero = ler.nextDouble();
	       
	        while (numero <= 100){

	        numero = numero * multiplicador;       

	        System.out.println("\nValor é : "+numero);
	        }
	}
	
}


