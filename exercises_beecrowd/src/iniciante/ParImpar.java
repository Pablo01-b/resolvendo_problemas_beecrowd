package iniciante;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int numeros = 0;
		
		for(int i=1; i<=n; i++) {
			numeros = sc.nextInt();
			if(numeros % 2 == 0 && numeros > 0) {
				System.out.println("EVEN POSITIVE");
			}else if(numeros % 2 == 0 && numeros < 0) {
				System.out.println("EVEN NEGATIVE");
			}else if(numeros % 2 != 0 && numeros > 0) {
				System.out.println("ODD POSITIVE");
			}else if(numeros % 2 != 0 && numeros < 0) {
				System.out.println("ODD NEGATIVE");
			}else if(numeros == 0) {
				System.out.println("NULL");
			}
		}
		
		sc.close();
		//BEE 1074

	}

}
