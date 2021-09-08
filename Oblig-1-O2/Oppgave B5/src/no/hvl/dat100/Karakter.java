package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Integer.*;

public class Karakter {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			String karTekst = showInputDialog("Hva er poengsummen din?");
			int poeng = parseInt(karTekst);
			
			if (0 > poeng) {
				showMessageDialog(null, "Ugyldig poengsum");
			}
			else if (poeng > 100) {
				showMessageDialog(null, "Ugyldig poengsum");
			}
			else if (poeng <= 39) {
				showMessageDialog(null, "Karakteren din er F.");
			}
			else if (poeng <= 49) {
				showMessageDialog(null, "Karakteren din er E.");
			}
			else if (poeng <= 59) {
				showMessageDialog(null, "Karakteren din er D.");
			}
			else if (poeng <= 79) {
				showMessageDialog(null, "Karakteren din er C.");
			}
			else if (poeng <= 89) {
				showMessageDialog(null, "Karakteren din er B.");
			}
			else if (poeng <= 100) {
				showMessageDialog(null, "Karakteren din er A.");
			}
		}

	}

}
