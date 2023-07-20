package exercises_beecrowd;

import java.util.Scanner;

public class produto_simples {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();
	
		System.out.println("PROD = " + (x * y));
		
		sc.close();
	}
}
