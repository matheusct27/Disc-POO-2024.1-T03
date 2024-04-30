package br.edu.principal;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] sexo = new String[5];
        String[] olhos = new String[5];
        String[] cabelos = new String[5];
        int[] idade = new int[5];
        int m, i, q;

        leitura(sexo, olhos, cabelos, idade);
        m = media_idade(olhos, cabelos, idade);
        System.out.println("Média de idade: " + m);
        i = maior_idade(sexo, olhos, cabelos, idade);
        System.out.println("Maior idade: " + i);
        q = qt_individuos(sexo, olhos, cabelos, idade);
        System.out.println("Quantidade de indivíduos: " + q);
    }

    public static void leitura(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        Scanner scanner = new Scanner(System.in);

        for (int x = 0; x < 5; x++) {
            do {
                System.out.print("Informe o sexo da pessoa (F/M): ");
                sexo[x] = scanner.next();
            } while (!sexo[x].equals("F") && !sexo[x].equals("M"));

            do {
                System.out.print("Informe a cor dos olhos (A/C): ");
                olhos[x] = scanner.next();
            } while (!olhos[x].equals("A") && !olhos[x].equals("C"));

            do {
                System.out.print("Informe a cor do cabelo (L/P/C): ");
                cabelos[x] = scanner.next();
            } while (!cabelos[x].equals("L") && !cabelos[x].equals("P") && !cabelos[x].equals("C"));

            System.out.print("Informe a idade da pessoa: ");
            idade[x] = scanner.nextInt();
        }
    }

    public static int media_idade(String[] olhos, String[] cabelos, int[] idade) {
        int soma = 0;
        int cont = 0;

        for (int i = 0; i < 5; i++) {
            if (olhos[i].equals("C") && cabelos[i].equals("P")) {
                soma += idade[i];
                cont++;
            }
        }

        return cont == 0 ? 0 : soma / cont;
    }

    public static int maior_idade(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        int maior = idade[0];

        for (int i = 1; i < 5; i++) {
            if (idade[i] > maior) {
                maior = idade[i];
            }
        }

        return maior;
    }

    public static int qt_individuos(String[] sexo, String[] olhos, String[] cabelos, int[] idade) {
        int qtd = 0;

        for (int i = 0; i < 5; i++) {
            if (sexo[i].equals("F") && idade[i] >= 18 && idade[i] <= 35 && olhos[i].equals("A") && cabelos[i].equals("L")) {
                qtd++;
            }
        }

        return qtd;
    }
}
