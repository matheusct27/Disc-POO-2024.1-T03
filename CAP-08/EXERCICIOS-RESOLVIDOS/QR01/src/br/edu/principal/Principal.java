package br.edu.principal;

import java.util.Scanner;

import br.edu.verificar.*;

public class Principal {

	public static void main(String[] args) {
		 double num, x;
		 Scanner sc = new Scanner (System.in);
		 System.out.println("Digite o número, por favor: ");
		 num = sc.nextDouble();
		 x = verificar.verifica(num);
		 if (x==1) {
			 System.out.println("Número positivo.");
		 }else {
			 System.out.println("Número negativo.");
		 }
		 

	}

}