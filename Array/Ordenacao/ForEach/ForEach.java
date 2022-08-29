package Array.Ordenacao.ForEach;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
       
        int n=3;
        Scanner sc = new Scanner(System.in);
        While(n!=1 && n!= 2){
        System.out.println("Aperte 1 para soma de números.");
        System.out.println("Aperte 2 para registro de nomes.");
        n =sc.nextInt();
        }
        

    }

    public class soma(){   
         
        int n, soma = 0;

        // Definindo meu índice
        System.out.println("Quantos números serão somados? ");
        n = sc.nextInt();
        int[] a = new int[n];

        // Preechendo meu array.
        System.out.println("Digite os números: ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int r : a) {
            soma += r;
        }
        System.out.println("Resultado: "+soma);}
       
}
