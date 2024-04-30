package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void ordena(int[] v) {
		int i, j, aux;
		
		for (i = 0; i < 5; i++) {
			for (j = 0; j < 4; j++) {
				if (v[j] > v[j+1]) {
					aux = v[j];
					v[j] = v[j+1];
					v[j+1] = aux;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int x;
		int[] vet = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (x = 0; x < 5; x++) {
			System.out.println("Digite um número: ");
			vet[x] = sc.nextInt();
		}
		
		ordena(vet);
		
		for (x = 0; x < 5; x++) {
			System.out.println("" + (x+1) + "ª posição: " + vet[x]);
		}
	}

}