package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class esfera {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		
		System.out.printf("VOLUME = %.3f%n", (4/3.0) * 3.14159 * Math.pow(raio, 3));
		
		sc.close();
		//BEE 1011
	}

}
