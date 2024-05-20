package Array.Preenchimento;

import java.util.Arrays;

public class PreencheVazio {

    public static void main(String[] args) {
        String[] names = new String[10];

        //Sem preenchimento
        System.out.println(Arrays.toString(names));
        
        //Preenchimento feito
        Arrays.fill(names, "Vazio");

        System.out.println(Arrays.toString(names));
    }
}
