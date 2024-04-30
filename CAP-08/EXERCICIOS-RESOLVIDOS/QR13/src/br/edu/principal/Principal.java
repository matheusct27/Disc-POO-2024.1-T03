package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] vet1 = new int[10];
		int[] vet2 = new int[vet1.length];
		int i;
		byte count = 1;

		System.out.println("Preencha o vetor.\n");
        for (i = 0; i < 10; i++) {

        	System.out.println("Preencha o valor do "+count+"º endereço do vetor com um número natural inteiro.");
            vet1[i] = sc.nextInt();
            while (vet1[i] < 0) {
                System.out.println("Não existe o fatorial de um número negativo (digite novamente um número natural).");
                vet1[i] = sc.nextInt();
            }
            count++;
        }
        
        fat(vet1,vet2);
        System.out.println("Fatoriais do vetor: ");
        for (int j = 0; j < 10; j++) {
            System.out.println("Fatorial de "+vet1[j]+": "+vet2[j]);
        }
        
	}
	
	public static void fat(int[] a, int[] b) {
        for (int i = 0; i < 10; i++) {
            if (a[i] == 0 || a[i] == 1) {
                b[i] = 1;
            } else {
                int f = 1;
                for (int j = 1; j <= a[i]; j++) {
                    f *= j;
                }
                b[i] = f;
            }
        }
    }

}