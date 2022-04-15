package Listas;

import java.util.Scanner;

public class Quest�o_2 {

	public static void main(String[] args) {
		//Quest�o 2. C�lculo do IMC
		
		Scanner s = new Scanner(System.in);
		
		//Entrada
		
		System.out.println("Informe seu peso: ");
		double peso = s.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = s.nextDouble();
		
		//Processamento
		double imc = peso / (altura * altura);
		
		//Sa�da
		System.out.println("O IMC � " + imc);
		
		if (imc < 20) {
			System.out.println("Abaixo do peso");
		} else
		
		if (imc >= 20 && imc <25) {
			System.out.println("Peso ideal");
		} else
		
		if (imc >= 25 && imc < 30) {
			System.out.println("Sobrepeso");
		} else
		
		if (imc >= 30 && imc < 40) {
			System.out.println("Obesidade");
		} else
		
		if (imc > 40) {
			System.out.println("Obesidade m�rbida");
		}

		s.close();
	}
}
