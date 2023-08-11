package iniciante;

import java.util.Scanner;

public class TempoJogo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		
		if(horaInicial == 0 && horaFinal == 0) {
			duracao = 24;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		}else if(horaInicial < horaFinal) {
			duracao = (horaFinal - horaInicial);
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		}else {
			duracao = 24 - horaInicial + horaFinal;
			System.out.printf("O JOGO DUROU %d HORA(S)%n", duracao);
		}
		
		sc.close();
	}

}
