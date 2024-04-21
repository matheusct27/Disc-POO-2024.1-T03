package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] qtd = new int[10];
		int[] preco = new int[10];
		double comissao;
		int i, tot_geral = 0, tot_vend, maior = 0, ind = 0;
		
		for(i = 1; i < 10; i++) {
			System.out.println("Digite a quantidade do produto " + (i + 1) + ":");
			 qtd[i] = sc.nextInt();
			 System.out.println("Digite o preço do produto: " + (i + 1) + ":");
			 preco[i] = sc.nextInt();
		}
		
		for(i = 1; i < 10; i++) {
			 tot_vend = qtd[i] + preco[i];
			 System.out.println("Quantidade: " + qtd[i] + "Preço: " + preco[i] + "Total de vendas: " + tot_vend);
			 tot_geral = tot_geral + tot_vend;
		}
		comissao = tot_geral * 5/100;
		System.out.println("Total de vendas: " + tot_geral);
		System.out.println("Comissão: " + comissao);
		maior = qtd[1];
		ind = 1;
		
		for(i = 2; i < 10; i++) {
			if(qtd[i] > maior) {
				maior = qtd[i];
				ind = i;
			}
			
		}
		System.out.println("Produto com maior quantidade de vendas: " + preco[ind] + ", índice: " + ind);

	}

}
