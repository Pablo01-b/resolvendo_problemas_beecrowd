package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class media2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("MEDIA = %.1f%n", (A * 2 + B * 3 + C * 5) / 10);
	
		sc.close();
		//BEE 1006
	}

}
