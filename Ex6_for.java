/*Desenvolver um sistema que efetue a soma de todos os números 
 * ímpares que são  múltiplos de três e que se encontram 
o conjunto dos números de 1 até 500*/

package exerciciosJava;
import java.util.Scanner;

public class Ex6_for {

	public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);{

    	int numero = 0, cont;

    	for (cont = 1; cont <= 500; cont +=3){
            if (numero % 2 != 0);{

                numero = numero + cont;
                System.out.println(cont);
      }
    	}

        System.out.println("\nA soma dos números ímpares e múltiplos de 3 é : " +numero);
           input.close();
    }

	}

}
