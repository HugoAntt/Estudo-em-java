public class Guerreiro extends Personagem {

    public float forca;
    public float destreza;
    public float peso;

    public Guerreiro(String nome, float life, float stamina, float mana, float forca, float dest, float peso) {

        this.nome = nome;
        this.life = life;
        this.stamina = stamina;
        this.mana = mana;
        this.forca = forca;
        this.destreza = dest;
        this.peso = peso;
    }

    public void furia(){
        if(stamina>40 && life<20)
        System.out.println("Personagem em fúria, buff dobra o dano e aumenta 175% a força temporariamente. ");
    }
}
