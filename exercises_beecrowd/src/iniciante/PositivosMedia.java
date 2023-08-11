package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class PositivosMedia {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int contador = 0;
		double numeros = 0;
		double media = 0;
		double positivos = 0;
		
		for(int i = 1; i <= 6; i++) {
			numeros = sc.nextDouble();
			if(numeros > 0) {
				contador++;
				positivos += numeros;
				media = positivos / contador;
			}
		}
		
		System.out.println(contador + " valores positivos");
		System.out.printf("%.1f%n", media);
		
		sc.close();

	}

}
