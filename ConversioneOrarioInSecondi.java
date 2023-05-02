package lezione1;

public class ConversioneOrarioInSecondi {
	public static void main(String args[]) {
		int ore = 13;
		int minuti = 40;
		int secondi = 30;
		int secondiTotali = secondi + minuti*60 + ore*3600;
		System.out.println(secondiTotali);
	}
}
