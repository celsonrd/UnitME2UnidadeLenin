package br.com.unit.nivel1;

import java.util.Scanner;

public class Comissao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		
		String codVendedor, codPeca = "";
		float preco, quantidade = 0;
		
		System.out.println("##### Programa para cálculo de comissão #####");

		/*
		 * 2) Faça um programa para pagamento de comissão de vendedores de peças,
		 * levando-se em consideração que sua comissão será de 5% do total da venda
		 * e que você tem os seguintes dados:
		 * - Identificação do vendedor
		 * - Código da peça
		 * - Preço unitário da peça
		 * - Quantidade vendida 
		 */
		
		
		System.out.print("Digite o código do vendedor: ");
		codVendedor = ler.next();
		
		System.out.print("Digite o código da peça: ");
		codPeca = ler.next();
		
		System.out.print("Digite o preço unitário das peças: ");
		preco = ler.nextFloat();
		
		System.out.print("Digite a quantidade de peças: ");
		quantidade = ler.nextFloat();
		
		System.out.println( "-------- " + codVendedor + " --------");
		System.out.println("Valor total da venda: R$ " + preco*quantidade);
		System.out.println("valor total da comissão: R$ " + (preco*quantidade)*0.05);
		
		System.out.println("+++++++++++++++++++++++++++++++\n\n");


	}

}
