package SequenciaFibonacci;
/* É uma sucessão de números que aparece codificada em muitos fenômenos da natureza. Descrita no final do século 12 pelo matemático italiano Leonardo Fibonacci. Os termos da sequência estabelecem entre si a chamada proporção (ou razão) áurea, muito usada na arte, na arquitetura e no design por ser considerada agradável aos olhos. Seu valor é de 1,618… 


Leia mais em: https://super.abril.com.br/mundo-estranho/o-que-e-a-sequencia-de-fibonacci/ */

import java.util.Scanner;

public class SF {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float n1 = 0, n2 = 1, n;
        System.out.println("Digite o limite da sua sequência Fibonacci!");
        float limit = s.nextFloat();

        while (n < limit) {
            n = n1 + n2;

            if (n > limit)
                break;

            System.out.println(n);
            n1 = n2;
            n2 = n;

        }
    }

}
