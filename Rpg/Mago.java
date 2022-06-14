package Rpg;
public class Mago extends Personagem {

    public float inteligencia;
    public float sabedoria;

    public Mago(String nome, float life, float stamina, float mana, float inte, float sab) {

        this.nome = nome;
        this.life = life;
        this.stamina = stamina;
        this.mana = mana;
        this.inteligencia = inte;
        this.sabedoria = sab;
    }

    public void fireBall() {
        if (mana < 40)
            System.out.println("Mana insuficiente!");
        else
            System.out.println("Bola de fogo lançada!");
    }

}
