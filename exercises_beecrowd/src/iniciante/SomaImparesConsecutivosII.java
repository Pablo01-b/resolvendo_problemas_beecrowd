package iniciante;

import java.util.Scanner;

public class SomaImparesConsecutivosII {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int soma = 0;

            
            for (int j = Math.min(x, y) + 1; j < Math.max(x, y); j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }

            System.out.println(soma);
        }
		
		sc.close();
		//BEE 1099
	}

}
