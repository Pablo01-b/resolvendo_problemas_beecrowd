package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class AumentoSalario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = sc.nextDouble();
		double porcentagem = 0;
		
		if(salario > 0 && salario <= 400.00) {
			porcentagem += 0.15;
			porcentagem = salario * porcentagem;
			salario += porcentagem;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", porcentagem);
			System.out.println("Em percentual: " + "15 %");
			
		}else if (salario > 400.00 && salario <= 800.00) {
			porcentagem += 0.12;
			porcentagem = salario * porcentagem;
			salario += porcentagem;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", porcentagem);
			System.out.println("Em percentual: " + "12 %");
			
		}else if (salario > 800.00 && salario <= 1200.00) {
			porcentagem += 0.10;
			porcentagem = salario * porcentagem;
			salario += porcentagem;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", porcentagem);
			System.out.println("Em percentual: " + "10 %");
			
		}else if (salario > 1200.00 && salario <= 2000.00) {
			porcentagem += 0.07;
			porcentagem = salario * porcentagem;
			salario += porcentagem;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", porcentagem);
			System.out.println("Em percentual: " + "7 %");
			
		}else if(salario > 2000.00) {
			porcentagem += 0.04;
			porcentagem = salario * porcentagem;
			salario += porcentagem;
			System.out.printf("Novo salario: %.2f%n", salario);
			System.out.printf("Reajuste ganho: %.2f%n", porcentagem);
			System.out.println("Em percentual: " + "4 %");
		}
	
		sc.close();

	}

}
