package iniciante;

import java.util.Scanner;

public class MaiorPosição {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int maior, numeros, posicao;
		maior = 0;
		posicao = 1;
		
		for(int i = 1; i <= 100; i++) {
			numeros = sc.nextInt();
			if(numeros > maior) {
				maior = numeros;
				posicao = i;
			}
		}
			System.out.println(maior);
			System.out.println(posicao);
		
		sc.close();
	}

}
