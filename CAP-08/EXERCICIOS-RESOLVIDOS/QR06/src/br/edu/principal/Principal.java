package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    int num;
	    do {
	    	System.out.println("Digite o número: ");
	    	num = sc.nextInt();
	    } while(num >= 1 && num <= 9); 
	    
	    multiplicacao(num);
	    	
	    	
	    }

	private static void multiplicacao(int n) {
		int i,j;
		
		for(i = 1; i <= n; i++) {
			for(j = 1; j <= i; j++) {
				System.out.println(i * j);
			}
		}
		
	}

	}


