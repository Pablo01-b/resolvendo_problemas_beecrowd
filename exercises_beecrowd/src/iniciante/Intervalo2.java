package iniciante;

import java.util.Scanner;

public class Intervalo2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = 0;
		int dentroIntervalo = 0;
		int foraIntervalo = 0;
		
		for(int i=0; i<n; i++) {
			x = sc.nextInt();
			if(x >= 10 && x <= 20) {
				dentroIntervalo++;
			}else {
				foraIntervalo++;
			}
		}
		
		System.out.println(dentroIntervalo + " in");
		System.out.println(foraIntervalo + " out");
		
		sc.close();
		//BEE 1072

	}

}
