package lezione1;

import java.util.Scanner;

public class PrezzoScontato {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		double prezzo = scanner.nextInt();
		double prezzoScontato = prezzo - prezzo*0.2;
		System.out.println(prezzoScontato);
		scanner.close();
	}
}
