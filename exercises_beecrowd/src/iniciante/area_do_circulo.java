package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class area_do_circulo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();
		System.out.printf("A=%.4f%n", (3.14159 * Math.pow(raio, 2)));

		sc.close();
	}
}
