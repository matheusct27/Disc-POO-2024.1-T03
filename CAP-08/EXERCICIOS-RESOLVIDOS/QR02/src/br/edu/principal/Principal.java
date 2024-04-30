package br.edu.principal;

import java.util.Scanner;



public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, s;
		System.out.println("Digite o primeiro número: ");
		num1 = sc.nextInt();
		System.out.println("Digite o segundo número: ");
		num2 = sc.nextInt();
		
		s = somar(num1, num2);
		

	}

	private static int somar(int num1, int num2) {
		int i, s = 0;
        for (i = num1 + 1; i < num2; i++) {
            s += i;
        }
        return s;
	}

}
