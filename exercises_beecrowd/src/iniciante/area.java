package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, C;
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		System.out.printf("TRIANGULO: %.3f%n", A * C / 2);
		System.out.printf("CIRCULO: %.3f%n", 3.14159 * Math.pow(C, 2));
		System.out.printf("TRAPEZIO: %.3f%n", (A + B) * C / 2);
		System.out.printf("QUADRADO: %.3f%n", B * B);
		System.out.printf("RETANGULO: %.3f%n", A * B );
	
		sc.close();
		//BEE 1012
	}

}
