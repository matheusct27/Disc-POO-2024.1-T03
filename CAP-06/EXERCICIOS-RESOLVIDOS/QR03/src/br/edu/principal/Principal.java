package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet1 = new int[10], vet2 = new int[10], vet3 = new int[20];
		int i, j;
		
		j = 1;
		
		for(i = 1; i < 10; i++) {
			System.out.println("Digite o primeiro vetor: "  );
			vet1[i] = sc.nextInt();
			
			vet3[j] = vet1[i];
			
			j = j + 1;
			
			System.out.println("Digite o segundo vetor: "  );
			vet2[i] = sc.nextInt();
			
			vet3[j] = vet2[i];
			j = j + 1;
			
			
		}
		
		for(i = 1; i < 20; i++) {
			System.out.println("Vetor 3: " + vet3[i]);
		}

	}

}
