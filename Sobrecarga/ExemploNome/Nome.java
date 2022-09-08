package Sobrecarga.ExemploNome;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nome {

    public static void main(String[] args) {
        User user1 = new User("Debora", "Nascimento");
        System.out.println(user1.output());
        System.out.println(user1.output(false));

        

    }

}
