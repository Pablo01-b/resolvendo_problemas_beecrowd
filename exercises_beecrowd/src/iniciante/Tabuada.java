package iniciante;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int tabuada = 0;
		
		for(int i = 1; i <= 10; i++) {
			tabuada = i * n;
			System.out.println(i + " x " + n + " = " + tabuada);
		}
	
		sc.close();
		//BEE 1078
	}

}
