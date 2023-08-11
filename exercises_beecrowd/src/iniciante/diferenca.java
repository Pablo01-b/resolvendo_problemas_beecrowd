package iniciante;

import java.util.Scanner;

public class diferenca {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D;
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		
		double diferenca = (A* B - C * D);
		
		System.out.printf("DIFERENCA = %.0f%n", diferenca);
		
		sc.close();
		//BEE 1007

	}

}
