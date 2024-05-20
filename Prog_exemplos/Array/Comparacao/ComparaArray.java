package Array.Comparacao;

import java.util.Arrays;
import java.util.Scanner;

public class ComparaArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[] { 9, 9, 9 };
        int[] b = new int[3];

        System.out.println("Digite a sequência acima para fins de comparação:");

        for (int i = 0; i <= 2; i++) {
            b[i] = s.nextInt();

        }
        System.out.println();
        System.out.println(Arrays.equals(a, b));
        System.out.println();

    }
}
