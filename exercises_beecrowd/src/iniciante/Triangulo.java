package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C, P;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		if(A + B > C && A + C > B && B + C > A) {
			P = A + B + C;
			System.out.printf("Perimetro = %.1f%n", P);
		}else {
			P = ((A + B) * C ) / 2;
			System.out.printf("Area = %.1f%n", P);
		}
		
		sc.close();
		
	}
}
