package Array.Ordenacao.ForEach;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n, soma = 0;

        // Definindo meu índice
        System.out.println("Quantos números serão somados? ");
        n = sc.nextInt();
        int[] a = new int[n];

        // Preechendo meu array.

        for (int i = 0; i < n; i++) {
            System.out.println("Digite o " + (i + 1) + "º número: ");
            a[i] = sc.nextInt();
        }

        for (int r : a) {
            soma += r;
        }
        System.out.println("Resultado: " + soma);
    }

}