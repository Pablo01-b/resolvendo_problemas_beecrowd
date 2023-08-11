package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class MediasPonderadas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		double valor1, valor2, valor3;
		
		for(int i = 1; i <= n; i++) {
			valor1 = sc.nextDouble();
			valor2 = sc.nextDouble();
			valor3 = sc.nextDouble();
			
			System.out.printf("%.1f%n", (valor1 * 2 + valor2 * 3 + valor3 * 5) / 10);
		}
		
		sc.close();
		//BEE 1079
	}

}
