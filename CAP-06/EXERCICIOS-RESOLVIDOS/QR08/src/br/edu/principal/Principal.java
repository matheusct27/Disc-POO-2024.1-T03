package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] x = new int[5], y = new int[5], r = new int[10];
		int i,j,z,aux;
		
		for(i = 1; i < 5; i++) {
			System.out.println("Digite o " + i + "� " + "n�mero");
			x[i] = sc.nextInt();
		}
		for(i = 1; i < 5; i++) {
			for(j = 1; j < 4; j++) {
				if(x[j] > x[j+1]) {
					aux = x[j];
					x[j] = x[j+1];
					x[j+1] = aux;
				}
			}
		}
		for(i = 1; i < 5; i++) {
			System.out.println("Digite o " + i + "� " + "n�mero");
			y[i] = sc.nextInt();
		}
		for(i = 1; i < 5; i++) {
			for(j = 1; j < 4; j++) {
				if(y[j] > y[j+1]) {
					aux = y[j];
					y[j] = y[j+1];
					y[j+1] = aux;
				}
			}
		}
		j = 1;
		for(i = 1; i < 5; i++) {
			r[j] = x[i];
			j = j + 1;
			r[j] = y[i];
			j = j + 1;
		}
		for(i = 1; i < 10; i++) {
			for(j = 1; j < 9; j++) {
				if(r[j] > r[j+1]) {
					aux = r[j];
					r[j] = r[j+1];
					r[j+1] = aux;
				}
			}
		}
		for(i = 1; i < 5; i++) {
			System.out.println( x[i]);
		}
		for(i = 1; i < 5; i++) {
			System.out.println(y[i]);
		}
		for(i = 1; i < 10; i++) {
			System.out.println(r[i]);
		}
		

	}

}
