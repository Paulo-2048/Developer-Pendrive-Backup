package br.ucsal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Qt1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float data = obterDados(sc);
		sc.close();
		float convertion = celciusParaFahrenheit(data);
		imprimir(data, convertion);

	}

	static void imprimir(float data, float convertion) {
		DecimalFormat deci = new DecimalFormat("0.00");
		System.out.printf("\nA conversão de %s %s para %s é igual a %s %s", data, "Celcius", "Fahrenheit",
				deci.format(convertion), "Fahrenheit");

	}

	private static float celciusParaFahrenheit(float data) {
		return data * 1.8f + 32;
	}

	static float obterDados(Scanner sc) {
		System.out.print("Insira o valor da temperatura em Celcius: ");
		float value = sc.nextFloat();
		return value;
	}
}