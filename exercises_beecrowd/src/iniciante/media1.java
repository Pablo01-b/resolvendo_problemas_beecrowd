package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class media1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B;
		A = sc.nextDouble();
		B = sc.nextDouble();
		
		System.out.printf("MEDIA = %.5f%n", (A * 3.5 + B * 7.5) / 11);
		
		sc.close();

	}

}
