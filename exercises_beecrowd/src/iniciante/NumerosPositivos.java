package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPositivos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int qtdPositivos = 0;
		
		for(int i = 1; i <= 6; i++) {
			double valor = sc.nextDouble();
			if(valor > 0) {
				qtdPositivos++;
			}
		}
		
		System.out.println(qtdPositivos + " valores positivos");
		
		sc.close();
		//BEE 1060
	}

}
