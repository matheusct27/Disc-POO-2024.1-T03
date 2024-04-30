package br.edu.principal;

import java.util.Scanner;

public class Principal {
	static Scanner sc = new Scanner(System.in);
    
	public static int uniao(int a[], int b[], int u[]) {
    	int i, k, cont;
    	k = 0;
    	for (i = 0; i < 10; i++) {
    		cont = 0;
    		
    		while (cont < k && (a[i] != u[cont])) {
    			cont = cont + 1;
    		}
    		
    		if (cont == k) {
    			u[k] = a[i];
    			k = k + 1;
    		}
    	}
    	
    	for (i = 0; i < 10; i++) {
    		cont = 0;
    		
    		while (cont < k && (b[i] != u[cont])) {
    			cont = cont + 1;
    		}
    		
    		if (cont == k) {
    			u[k] = b[i];
    			k = k + 1;
    		}
    	}
    	
    	return k;
    }
	
	public static void main(String[] args) {
		int x, vet1[] = new int[10], vet2[] = new int[10], vet3[] = new int[20], cont;
		
		for (x = 0; x < 10; x++) {
			while (vet1[x] <= 0) {
				System.out.println("Valor " + (x+1) + "º do vetor 1: ");
				vet1[x] = sc.nextInt();
			}
		}
		for (x = 0; x < 10; x++) {
			while (vet2[x] <= 0) {
				System.out.println("Valor " + (x+1) + "º do vetor 2: ");
				vet2[x] = sc.nextInt();
			}
		}
		
		cont = uniao(vet1, vet2, vet3);
		
		x = 0;
		
		System.out.println("\nUnião:");
		while (x < cont) {
			System.out.print(vet3[x] + " ");
			x = x + 1;
		}
	}

}