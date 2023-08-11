package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Salario {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroFuncionario, qtdHoras;
		double valorHora;
		
		numeroFuncionario = sc.nextInt();
		qtdHoras = sc.nextInt();
		valorHora = sc.nextDouble();
		
		System.out.println("NUMBER = " + numeroFuncionario);
		System.out.printf("SALARY = U$ %.2f%n", (valorHora * qtdHoras));
		
		sc.close();

	}

}
