package iniciante;

import java.util.Scanner;

public class ParesCincoNumeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		int contador = 0;
		
		for(int i = 1; i <= 5; i++) {
			numeros = sc.nextInt();
			if(numeros % 2 == 0) {
				contador++;
			}
		}
		
		System.out.println(contador + " valores pares");
		
		sc.close();
		//BEE 1065
	}

}
