package iniciante;

import java.util.Scanner;

public class QuadradoPares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				int quadrado = i * i;
				System.out.println(i + "^2 = " + quadrado);
			}
		}
		
		sc.close();
		//BEE 1073
	}

}
