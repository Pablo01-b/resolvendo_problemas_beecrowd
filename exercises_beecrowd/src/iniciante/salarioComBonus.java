package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class salarioComBonus {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nomeVendedor;
		double salarioFixo, montanteVendas;
		
		nomeVendedor = sc.nextLine();
		salarioFixo = sc.nextDouble();
		montanteVendas = sc.nextDouble();
		
		System.out.printf("TOTAL = R$ %.2f%n", (montanteVendas * 0.15 + salarioFixo));
		
		
		sc.close();
		//BEE 1009
	}

}
