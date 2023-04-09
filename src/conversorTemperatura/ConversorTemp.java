package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConversorTemp {

	public void convertirCenF(double valor) {
		double farenheit = valor * 1.8 + 32;
		farenheit = Math.round(farenheit * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°C = " + farenheit + "°F");

	}

	public void convertirFenC(double valor) {
		double celcius = (valor - 32) / 1.8;
		celcius = Math.round(celcius * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°F = " + celcius + "°C");

	}

	public void convertirCenK(double valor) {
		double kelvin = valor + 273.15;
		kelvin = Math.round(kelvin * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°C = " + kelvin + "°K");

	}

	public void convertirKenC(double valor) {
		double celcius = valor - 273.15;
		celcius = Math.round(celcius * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°K = " + celcius + "°C");

	}

	public void convertirFenK(double valor) {

		double kelvin = (valor - 32) * 5 / 9 + 273.15;
		kelvin = Math.round(kelvin * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°F = " + kelvin + "°K");

	}

	public void convertirKenF(double valor) {
		double farenheit = (valor - 273.15) * 9 / 5 + 32;
		farenheit = Math.round(farenheit * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + "°K = " + farenheit + "°F");
	}
}
