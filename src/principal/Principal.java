package principal;


import javax.swing.JOptionPane;

import conversorMoneda.OpcionesConversion;
import conversorTemperatura.OpcionesConversionTemp;

public class Principal {

	public static void main(String[] args) {

		OpcionesConversion conversionMoneda = new OpcionesConversion();
		OpcionesConversionTemp conversionTemp = new OpcionesConversionTemp();
		
		boolean flag = true;
		while (flag) {
			String opcion = new String();
			try {
				opcion = JOptionPane
						.showInputDialog(null, "Seleccione tipo de conversion", "Menú", JOptionPane.PLAIN_MESSAGE, null,
								new Object[] { "Conversor de Moneda", "Conversor de Temperatura" }, "Elegir")
						.toString();
			} catch (NullPointerException e) {
				JOptionPane.showMessageDialog(null, "programa terminado");
				System.exit(0);
			}

			switch (opcion) {
			case "Conversor de Moneda":
				try {
					double input = Double
							.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a convertir"));
					conversionMoneda.convertirMonedas(input);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No se admiten letras, solo números");
				}
				int seguir = JOptionPane.showConfirmDialog(null, "Desea Realizar otra conversion", "",
						JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION != seguir || JOptionPane.CLOSED_OPTION == seguir) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					flag = false;
				}
				break;
			case "Conversor de Temperatura":
				try {
					double inputTemp = Double
							.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el valor a convertir"));
					conversionTemp.convertirTemp(inputTemp);
				} catch (NumberFormatException e) {
					JOptionPane.showMessageDialog(null, "No se admiten letras, solo números");
				}
				seguir = JOptionPane.showConfirmDialog(null, "Desea Realizar otra conversion", "",
						JOptionPane.YES_NO_OPTION);
				if (JOptionPane.OK_OPTION != seguir || JOptionPane.CLOSED_OPTION == seguir) {
					JOptionPane.showMessageDialog(null, "Programa Terminado");
					flag = false;
				}
				break;
			}
		}

	}

}
