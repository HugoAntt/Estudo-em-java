import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String resposta;

        do {
            System.out.println("\n=== Bem-vindo ao Menu de Opções ===");
            System.out.println("1 - Dizer Olá");
            System.out.println("2 - Fazer um cálculo simples");
            System.out.println("3 - Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = entrada.nextInt();
            entrada.nextLine(); // consumir quebra de linha após o número

            switch (opcao) {
                case 1:
                    System.out.print("Digite seu nome: ");
                    String nome = entrada.nextLine();
                    System.out.println("Olá, " + nome + "!");
                    break;

                case 2:
                    System.out.print("Digite o primeiro número: ");
                    double num1 = entrada.nextDouble();
                    System.out.print("Digite o segundo número: ");
                    double num2 = entrada.nextDouble();
                    double soma = num1 + num2;
                    System.out.println("A soma é: " + soma);
                    entrada.nextLine(); // consumir quebra de linha
                    break;

                case 3:
                    System.out.println("Encerrando o programa. Até mais!");
                    entrada.close();
                    return; // encerra o programa aqui
                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("\nDeseja repetir o programa? (sim/não): ");
            resposta = entrada.nextLine().trim().toLowerCase();

        } while (resposta.equals("sim") || resposta.equals("s"));

        System.out.println("Obrigado por usar o programa. Até logo!");
        entrada.close();
    }
}
