package br.com.unit.nivel1;

import java.util.Scanner;

public class Cambio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		/*
		 * 1) Faça um programa que:
		 * - Leia a cotação do dólar
		 * - Leia um valor em dólares
 		 * - Converta esse valor para Real
         * - Mostre o resultado 
		 */
		
		float cambio = 0;
		float valor = 0;
		
		System.out.println("##### Programa de Câmbio #####");
		System.out.print("Digite o valor do cambio: ");
		cambio = ler.nextFloat();
		System.out.print("Digite o valor para converter: ");
		valor = ler.nextFloat();
		System.out.println("R$" + valor + " equivale a $" + cambio*valor);
		
		System.out.println("+++++++++++++++++++++++++++++++\n\n");

		
		
				
		
		
		/*
		 * 3) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e 
		 * multiplicação entre os valores lidos, 
		 * baseando-se na utilização do conceito de propriedade distributiva. 
		 * Dica: se forem lidas as variáveis A, B, C e D, devem ser somados e 
		 * multiplicados os valores de A com B, A com C e A com D; 
		 * depois B com C, B com D e por último C com D. 
		 * Note que para cada operação serão utilizadas seis combinações. 
		 * Assim sendo, devem ser realizadas doze operações de processamento, 
		 * sendo seis para as adições e seis para as multiplicações. 
		 */
		
		
		

	}

}
