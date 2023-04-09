package conversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {

	ConversorMoneda conversor = new ConversorMoneda();

	public void convertirMonedas(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije el tipo de cambio", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De ARS a USD", "De USD a ARS", "De ARS a EURO", "De EURO a ARS", 
						"De ARS a GBP", "De GBP a ARS", "De ARS a YEN", "De YEN a ARS", "De ARS a WON", "De WON a ARS" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De ARS a USD":
			conversor.ConvertirArsEnUsd(valor);
			break;
		case "De USD a ARS":
			conversor.ConvertirUsdEnArs(valor);
			break;
		case "De ARS a EURO":
			conversor.ConvertirArsEnEur(valor);
			break;
		case "De EURO a ARS":
			conversor.ConvertirEurEnArs(valor);
			break;
		case "De ARS a GBP":
			conversor.ConvertirArsEnLib(valor);
			break;
		case "De GBP a ARS":
			conversor.ConvertirLibEnArs(valor);
			break;
		case "De ARS a YEN":
			conversor.ConvertirArsEnYen(valor);
			break;
		case "De YEN a ARS":
			conversor.ConvertirYenEnArs(valor);
			break;
		case "De ARS a WON":
			conversor.ConvertirArsEnWon(valor);
			break;
		case "De WON a ARS":
			conversor.COnvertirWonEnArs(valor);
			break;
		}
				

	}

}