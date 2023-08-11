package iniciante;

import java.util.Scanner;

public class ParesImparesPositivosNegativos {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros, contadorPares, contadorImpares, contadorPositivos, contadorNegativos;
		contadorPares = 0;
		contadorImpares = 0;
		contadorPositivos = 0;
		contadorNegativos = 0;
		
		for(int i = 1; i <= 5; i++) {
			numeros = sc.nextInt();
			if(numeros % 2 == 0) {
				contadorPares++;
			}if(numeros % 2 != 0) {
				contadorImpares++;
			}if(numeros > 0) {
				contadorPositivos++;
			}if(numeros < 0) {
				contadorNegativos++;
			}
		}
		
		System.out.println(contadorPares + " valor(es) par(es)");
		System.out.println(contadorImpares + " valor(es) impar(es)");
		System.out.println(contadorPositivos + " valor(es) positivo(s)");
		System.out.println(contadorNegativos + " valor(es) negativo(s)");
		
		sc.close();

	}

}
