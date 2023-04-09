package conversorTemperatura;

import javax.swing.JOptionPane;

public class OpcionesConversionTemp {

	ConversorTemp conversor = new ConversorTemp();

	public void convertirTemp(double valor) {
		String opcion = (JOptionPane.showInputDialog(null, "Elije el tipo de Conversion", "Temperatura",
				JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De Celcius a Farenheit", "De Farenheit a Celcius", "De Celcius a Kelvin",
						"De Kelvin a Celcius", "De Farenheit a Kelvin", "De Kelvin a Farenheit" },
				"Seleccion")).toString();
		switch (opcion) {
		case "De Celcius a Farenheit":
			conversor.convertirCenF(valor);
			break;
		case "De Farenheit a Celcius":
			conversor.convertirFenC(valor);
			break;
		case "De Celcius a Kelvin":
			conversor.convertirCenK(valor);
			break;
		case "De Kelvin a Celcius":
			conversor.convertirKenC(valor);
			break;
		case "De Farenheit a Kelvin":
			conversor.convertirFenK(valor);
			break;
		case "De Kelvin a Farenheit":
			conversor.convertirKenF(valor);
			break;
		}
	}
}
