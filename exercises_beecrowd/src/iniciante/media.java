package iniciante;

import java.util.Locale;
import java.util.Scanner;

public class media {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double n1, n2, n3, n4, media, mediaFinal;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		n3 = sc.nextDouble();
		n4 = sc.nextDouble();
		media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10.0;
		mediaFinal = 0;

		media = Math.floor(media * 10) / 10;
		System.out.printf("Media: %.1f%n", media);

		if (media >= 7) {
			System.out.println("Aluno aprovado.");
		} else if (media < 5.0) {
			System.out.println("Aluno reprovado.");
		} else if (media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.");
			double notaExame = sc.nextDouble();
			System.out.println("Nota do exame: " + notaExame);
			mediaFinal = (notaExame + media) / 2;
			if (mediaFinal >= 5.0) {
				System.out.println("Aluno aprovado.");
				System.out.printf("Media final: %.1f%n", mediaFinal);
				if (mediaFinal <= 4.9) {
					System.out.println("Aluno reprovado.");
					System.out.printf("Media Final: ");
				}
			}
		}
		sc.close();

	}

}
