package no.hvl.dat100;

public class Fakultet {

	static int fakultet(int n) {
		int svar = 1;
		//i-- ettersom at vi vil redusere i med 1 i hver løkke
		for (int i = n; i > 0; i--) {
			svar = svar * i;
		}
		
		return svar;
	}
	public static void main(String[] args) {
		System.out.println(fakultet(1));
		

	}

}
