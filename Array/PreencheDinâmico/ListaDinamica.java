package Array.PreencheDinâmico;

import java.util.ArrayList;
import java.util.List;

public class ListaDinamica {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(); 
        names.add("Nome 1");
        names.add("Nome 2");
        names.add("Nome 3");
        names.add("Nome 4");
        names.add("Nome 5");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        //Encontrar o indice através do elemento
        int index = names.indexOf("Nome 5");
        System.out.println("Posição de 'Nome 5': "+index);
        //ou
        System.out.println("Posição de 'Nome 2': "+names.indexOf("Nome 2"));

        //Verifica se a lista está vazia
        System.out.println("A lista está vazia? "+names.isEmpty());

        //Verifica se a lista contém algum elemento
        System.out.println("Tem algum elemento nesse espaço? "+names.contains("Nome 1"));

        //Verifica o tamanho da lista
        System.out.println("Tamanho atual da lista: "+names.size());

        //Remover todos os elementos da lista
        names.clear();

        //Nova verificação se a lista está vazia
        System.out.println("A lista está vazia? "+names.isEmpty());

    }
}
