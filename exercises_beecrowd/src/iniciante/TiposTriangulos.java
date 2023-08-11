package iniciante;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class TiposTriangulos {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double[] lados = new double[3];
		for (int i = 0; i < 3; i++) {
			lados[i] = sc.nextDouble();
		}

		Arrays.sort(lados);
		double a = lados[2];
		double b = lados[1];
		double c = lados[0];

		if (a >= (b + c)) {
			System.out.println("NAO FORMA TRIANGULO");
		} else {
			if ((a * a) == (b * b) + (c * c)) {
				System.out.println("TRIANGULO RETANGULO");
			}
			if ((a * a) > (b * b) + (c * c)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			}
			if ((a * a) < (b * b) + (c * c)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (a == b && b == c) {
				System.out.println("TRIANGULO EQUILATERO");
			}
			if ((a == b && b != c) || (a == c && c != b) || (b == c && c != a)) {
				System.out.println("TRIANGULO ISOSCELES");
			}
		}

		sc.close();
		//BEE 1045
	}

}
