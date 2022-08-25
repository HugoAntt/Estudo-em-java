package Array.PreencheDinâmico;

import java.util.ArrayList;
import java.util.List;

public class ListaDinamica {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Nome1");
        names.add("Nome2");
        names.add("Nome3");
        names.add("Nome4");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));

        }

    }
}
