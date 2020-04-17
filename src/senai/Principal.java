package senai;

import java.util.Locale;
import java.util.Scanner;

import entidades.Comodo;

public class Principal {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Digite o valor em Reais do KW");
		double valorKw = sc.nextDouble();
		System.out.println("Digite a quantidade de cômodos para o calcular o consumo do kw:");
		int n = sc.nextInt();
		int b = 1;

		Comodo[] vect = new Comodo[n];
		for (int i = 0; i < vect.length; i++) {
			
			sc.nextLine();
			System.out.println("Digite o nome do " + b + "º cômodo:");
			String nome = sc.nextLine();
			System.out.println("Digite o consumo em KW desse cômodo:");
			double consumo = sc.nextDouble();
			vect[i] = new Comodo(nome, consumo);
			b += 1;
		}
		double soma = 0.0;
		double custo = 0.0;
		
		for (int i = 0; i < vect.length; i++) {
			custo = vect[i].getConsumo() * valorKw;
			System.out.printf("No cômodo " + vect[i].getNome() + ", o custo em KW é de R$%.2f%n", custo);
			soma += custo;
		}

		System.out.printf("E o valor total de consumo dos cômodos em KW é de R$%.2f%n", soma);

		sc.close();
	}

}
