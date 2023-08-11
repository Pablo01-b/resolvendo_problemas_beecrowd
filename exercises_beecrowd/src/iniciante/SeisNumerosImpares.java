package iniciante;

import java.util.Scanner;

public class SeisNumerosImpares {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=6; n++) {
			if(n % 2 != 0) {
				System.out.println(n);
				i++;
			}
		}
		
		sc.close();
	}

}
