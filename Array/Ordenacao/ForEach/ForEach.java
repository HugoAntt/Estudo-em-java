package Array.Ordenacao.ForEach;

import java.util.Scanner;

public class ForEach {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int n=0, soma=0;
        opcao(sc, n);

        if(n == 1)
        somar(sc, n, soma);


    }

    public static int opcao(Scanner sc, int n ){
       
        

        System.out.println("Aperte 1 para soma de números.");
        System.out.println("Aperte 2 para registro de nomes.");
        n =sc.nextInt(); 

        While(n!= 1 && n!= 2){
        System.out.println("Aperte 1 para soma de números.");
        System.out.println("Aperte 2 para registro de nomes.");
        n =sc.nextInt();  
        }
        return n;
    }

    public static void somar(Scanner sc, int n, int soma){


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
        System.out.println("Resultado: " + soma);
    }

}
