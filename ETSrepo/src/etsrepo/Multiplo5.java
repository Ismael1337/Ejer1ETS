package etsrepo;

public class Multiplo5 {

	public static void main(String[] args) {
		boolean repetir = true;
		int cont = 0;
		
		for (int i = 1; repetir; i++) {
			
			if (i % 10 == 0) {
				System.out.println((cont+1) + ": " + i + "  ");
			cont = cont + 1;
			}
			if (cont == 150)
				repetir = false;
		}

	}

}
