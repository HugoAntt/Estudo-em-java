package Seleção.Calculadora;

import java.util.Scanner;

public class Inicio {

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
            entrada.nextLine();

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
                    entrada.nextLine();

                    System.out.println("Escolha a operação:");
                    System.out.println("1 - Soma");
                    System.out.println("2 - Subtração");
                    System.out.println("3 - Multiplicação");
                    System.out.println("4 - Divisão");
                    System.out.print("Digite a opção: ");
                    int operacao = entrada.nextInt();
                    entrada.nextLine();

                    switch (operacao) {
                        case 1:
                            System.out.println("Resultado: " + (num1 + num2));
                            break;
                        case 2:
                            System.out.println("Resultado: " + (num1 - num2));
                            break;
                        case 3:
                            System.out.println("Resultado: " + (num1 * num2));
                            break;
                        case 4:
                            if (num2 != 0) {
                                System.out.println("Resultado: " + (num1 / num2));
                            } else {
                                System.out.println("Erro: divisão por zero!");
                            }
                            break;
                        default:
                            System.out.println("Operação inválida.");
                    }
                    break;

                case 3:
                    System.out.println("Encerrando o programa. Até mais!");
                    entrada.close();
                    return;

                default:
                    System.out.println("Opção inválida.");
            }

            System.out.print("\nDeseja repetir o programa? (sim/não): ");
            resposta = entrada.nextLine().trim().toLowerCase();

        } while (resposta.equals("sim") || resposta.equals("s"));

        System.out.println("Obrigado por usar o programa. Até logo!");

    }
}