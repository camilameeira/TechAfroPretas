/*5. A prefeitura de uma cidade fez uma pesquisa entre 
 * 3 de seus habitantes,coletando dados sobre o salário 
 * e número de filhos. A prefeitura deseja saber:  
 *  a) média do salário da população; 
 *  b) média do número de filhos; 
 *  c) maior salário; 
 *  d) percentual de pessoas com salário até R$100,00.  */

package exerciciosJava;
import java.util.Scanner;

public class Ex5_for {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);

		int pop, filhos, total_filhos = 0, i, y = 1;
		float sal, total_sal = 0, media_sal, media_filhos, maior_sal = 0, perc_sal = 0;
		
		System.out.println("Qual a populacao da cidade..: \n");
		pop = ler.nextInt();

		for (i = 1; i <= pop; i++) {

		System.out.println("Qual o seu salario.........: R$ \n");
		sal = ler.nextFloat();

		System.out.println("Qual a quantidade de filhos...: \n");
		filhos = ler.nextInt();

		total_sal = sal + total_sal;

		total_filhos = total_filhos + filhos;

		if (maior_sal < sal) {
		maior_sal = sal;
		}

		if (sal <= 100) {
		perc_sal = (y * 100) / pop;
		y++;
		}
	}
		media_sal = total_sal / pop;
		media_filhos = total_filhos / pop;

		System.out.println("\n---------------------------------------------------------------\n");
		System.out.println("\nA media do salario da populacao eh R$ " + media_sal);
		System.out.println("\nA media do numero dos filhos eh " + media_filhos);
		System.out.println("\nO maior salario eh R$ " + maior_sal);
		System.out.println("\nA porcentagem das pessoas com salarios ate R$ 100,00 eh " + perc_sal);
	
	}
}