package String.Escolha;


import java.util.Scanner;

public class Escolha {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int soma = 0;

        int n = opcao();

        if (n == 1)
            somar(sc, n, soma);

        // Esse else está sem especificação, pois a validação ja acontecente no método
        // opção, ou seja, só é retornado os valores que se encaiaxam no if ou else,
        // nesse caso, 1 ou 2.
        else
            nomes(sc, n);

    }

    public static int opcao() {

        int n;
        Scanner sc = new Scanner(System.in);

        System.out.println("Aperte 1 para soma de números.");
        System.out.println("Aperte 2 para registro de nomes.");
        n = sc.nextInt();

        while (n != 1 && n != 2) {
            System.out.println("Digite uma das opções disponíveis abaixo:");
            System.out.println("Aperte 1 para soma de números.");
            System.out.println("Aperte 2 para registro de nomes.");
            n = sc.nextInt();
        }

        return n;
    }

    public static void somar(Scanner sc, int n, int soma) {

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

    public static void nomes(Scanner sc, int n) {

        System.out.println("Quantos nomes serão armazenados? ");

        n = sc.nextInt();

        String[] nome = new String[n];
        
        //Armazenamento
        for (int i = 0; i < n; i++) {

            System.out.println("Digite o " + (i + 1) + "º nome:");
            nome[i] = new Scanner(System.in).nextLine();
        }
        System.out.println();
        //Exibição
        for (int i = 0; i < n; i++) {
            System.out.println(nome[i]);
        }
    }

}
