/*Faça um sistema que leia o tempo de duração de um evento 
 * em uma fábrica expressa em segundos e mostre-o expresso em horas, 
 * minutos e segundos.*/

package exerciciosJava;

import java.io.IOException;
import java.util.Scanner;

public class Ex1_algoritmos {

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")	
			
		Scanner input = new Scanner (System.in);
		
		int tempoD, horas, minutos, segundos;

		tempoD = input.nextInt();

		horas = (tempoD /3600);
		minutos = ((tempoD % 3600)/ 60);
		segundos = ((tempoD % 3600)% 60);
			
		System.out.println("O tempo de duração do evento será de: \n horas, " + horas +"\nminutos, " + minutos + "\nsegundos :" + segundos);

	}		
}

