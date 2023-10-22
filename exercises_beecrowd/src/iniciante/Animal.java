package iniciante;

import java.util.Scanner;

public class Animal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String plvr1, plvr2, plvr3;

		plvr1 = sc.nextLine();
		plvr2 = sc.nextLine();
		plvr3 = sc.nextLine();

		if (plvr1.equals("vertebrado") && plvr2.equals("ave") && plvr3.equals("carnivoro")) {
			System.out.println("aguia");
			
		} else if (plvr1.equals("vertebrado") && plvr2.equals("ave") && plvr3.equals("onivoro")) {
			System.out.println("pomba");
			
		} else if (plvr1.equals("vertebrado") && plvr2.equals("mamifero") && plvr3.equals("onivoro")) {
			System.out.println("homem");
			
		} else if (plvr1.equals("vertebrado") && plvr2.equals("mamifero") && plvr3.equals("herbivoro")) {
			System.out.println("vaca");
			
		} else if (plvr1.equals("invertebrado") && plvr2.equals("inseto") && plvr3.equals("hematofago")) {
			System.out.println("pulga");
			
		} else if (plvr1.equals("invertebrado") && plvr2.equals("inseto") && plvr3.equals("herbivoro")) {
			System.out.println("lagarta");
			
		} else if (plvr1.equals("invertebrado") && plvr2.equals("anelideo") && plvr3.equals("hematofago")) {
			System.out.println("sanguessuga");
			
		} else if (plvr1.equals("invertebrado") && plvr2.equals("anelideo") && plvr3.equals("onivoro")) {
			System.out.println("minhoca");
		}

		sc.close();
		//BEE 1049
	}

	//revendo código em outra máquina
}
