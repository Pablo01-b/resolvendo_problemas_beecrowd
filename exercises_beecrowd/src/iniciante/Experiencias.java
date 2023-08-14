package iniciante;

import java.util.Scanner;

public class Experiencias {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int Cobaias = 0;
		int coelhos = 0;
		int ratos = 0;
		int sapos = 0;
		
		double porcentagemCoelhos, porcentagemRatos, porcentagemSapos;

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int qtd = sc.nextInt();
			char identificarTipo = sc.next().charAt(0);

			Cobaias += qtd;

			switch (identificarTipo) {
			case 'C':
				coelhos += qtd;
				break;
			case 'R':
				ratos += qtd;
				break;
			case 'S':
				sapos += qtd;
				break;
			default:
				break;
			}
		}

		porcentagemCoelhos = (double) coelhos / Cobaias * 100;
		porcentagemRatos = (double) ratos / Cobaias * 100;
		porcentagemSapos = (double) sapos / Cobaias * 100;

		System.out.println("Total: " + Cobaias + " cobaias");
		System.out.println("Total de coelhos: " + coelhos);
		System.out.println("Total de ratos: " + ratos);
		System.out.println("Total de sapos: " + sapos);
		System.out.printf("Percentual de coelhos: %.2f %%\n", porcentagemCoelhos);
		System.out.printf("Percentual de ratos: %.2f %%\n", porcentagemRatos);
		System.out.printf("Percentual de sapos: %.2f %%\n", porcentagemSapos);

		sc.close();
		//BEE 1094
		
	}

}
