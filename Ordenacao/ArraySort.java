package Ordenacao;

import java.util.Scanner;
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int[] a = new int[6];

        System.out.println("Digite sua sequência de números.");

        for (int i = 0; i < 6; i++) {
            a[i] = s.nextInt();
        }
        // A lista está ordenada, porém em hashcode.
        Arrays.sort(a);

        System.out.println(Arrays.toString(a));

    }
}