package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class calculoSimples {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int cod1, qtd1, cod2, qtd2;
		double valor1, valor2;
		
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		valor1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", (qtd1 * valor1 + qtd2 * valor2));
		
		
		sc.close();
		//BEE 1010
	}

}
