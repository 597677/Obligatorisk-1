package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

import static java.lang.Double.*;

public class Trinnskatt2 {

	public static void main(String[] args) {
		
		String trinnTekst = showInputDialog("Hva er din inntekt?");
		double inntekt = parseDouble(trinnTekst);
		
		if (inntekt <= 164100) {
			showMessageDialog(null,"Her er trinnskatten din: " + inntekt*0);
		}
		else if (inntekt >= 164101 && inntekt <= 230950) {
			showMessageDialog(null,"Her er trinnskatten din: " + inntekt*0.0093);
		}
		else if (inntekt >= 230951 && inntekt <= 580650) {
			showMessageDialog(null,"Her er trinnskatten din: " + inntekt*0.0241);
		}
		else if (inntekt >= 580651 && inntekt <= 934050) {
			showMessageDialog(null,"Her er trinnskatten din: " + inntekt*0.1152);
		}
		else if (inntekt >= 934051) {
			showMessageDialog(null,"Her er trinnskatten din: " + inntekt*0.1452);
		}
	}

}