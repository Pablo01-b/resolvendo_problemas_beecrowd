package iniciante;

public class SequenciaIJ {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 60;
		
		System.out.println("I=" + i + " J=" + j);
		for(int pos = 0; pos <= j; pos++) {
			j = j -5;
			i = i + 3;
			System.out.println("I=" + i + " J=" + j);
		}	
		i = i + 3;
		j = j -5;
		System.out.println("I=" + i + " J=" + j);
		//BEE 1095
	}

}
