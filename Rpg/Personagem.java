package Rpg;
public class Personagem {

    public String nome;
    public float life;
    public float stamina;
    public float mana;

    public void usarPocao() {
        if (precisa())
            System.out.println("Tomar poção");
        else
            System.out.println("Poção guardada.");
    }

    public boolean precisa() {
        if (life < 30)
            return true;
        return false;
    }
}
