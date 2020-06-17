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


	}

}
