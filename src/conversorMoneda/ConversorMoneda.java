package conversorMoneda;

import javax.swing.JOptionPane;

public class ConversorMoneda {
	private static double usd = 392.0;
	private static double eur = 422.0;
	private static double lib = 308.01;
	private static double yen = 1.58;
	private static double won = 0.16;
	

	public void ConvertirArsEnUsd(double valor) {
		double valorEnUsd = valor / usd;
		valorEnUsd = Math.round(valorEnUsd * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " ARS Equivalen a: " + valorEnUsd + " USD");

	}

	public void ConvertirUsdEnArs(double valor) {
		double valorEnArg = valor * usd;
		valorEnArg = Math.round(valorEnArg * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " USD Equivalen a: " + valorEnArg + " ARG");

	}

	public void ConvertirArsEnEur(double valor) {
		double valorEnEur = valor / eur;
		valorEnEur = Math.round(valorEnEur * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,valor + " ARS Equivalen a: " + valorEnEur + " EUR");

	}

	public void ConvertirEurEnArs(double valor) {
		double valorEnArg = valor * eur;
		valorEnArg = Math.round(valorEnArg * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null,valor + " EUR Equivalen a: "  + valorEnArg + " ARG");

	}
	public void ConvertirArsEnLib(double valor) {
		double valorEnLib = valor / lib;
		valorEnLib = Math.round(valorEnLib * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " ARS Equivalen a: " + valorEnLib + " GBP");

	}

	public void ConvertirLibEnArs(double valor) {
		double valorEnArg = valor * lib;
		valorEnArg = Math.round(valorEnArg * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " GBP Equivalen a: " + valorEnArg + " ARG");

	}
	public void ConvertirArsEnYen(double valor) {
		double valorEnYen = valor / yen;
		valorEnYen = Math.round(valorEnYen * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " ARS Equivalen a: " + valorEnYen + " YEN");

	}

	public void ConvertirYenEnArs(double valor) {
		double valorEnArg = valor * yen;
		valorEnArg = Math.round(valorEnArg * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " YEN Equivalen a: " + valorEnArg + " ARG");

	}
	public void ConvertirArsEnWon(double valor) {
		double valorEnWon = valor / won;
		valorEnWon = Math.round(valorEnWon * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " ARS Equivalen a: " + valorEnWon + " WON");

	}

	public void COnvertirWonEnArs(double valor) {
		double valorEnArg = valor * won;
		valorEnArg = Math.round(valorEnArg * 100.0) / 100.0;
		JOptionPane.showMessageDialog(null, valor + " WON Equivalen a: " + valorEnArg + " ARG");

	}

}
