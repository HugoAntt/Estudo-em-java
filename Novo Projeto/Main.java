import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Bem-vindo ao Menu de Opções ===");
        System.out.println("1 - Dizer Olá");
        System.out.println("2 - Fazer um cálculo simples");
        System.out.println("3 - Sair");

        System.out.print("Escolha uma opção: ");
        int opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.print("Digite seu nome: ");
                entrada.nextLine(); // consumir quebra de linha
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
                break;

            case 3:
                System.out.println("Encerrando o programa. Até mais!");
                break;

            default:
                System.out.println("Opção inválida.");
                break;
        }

        entrada.close();
    }
}
