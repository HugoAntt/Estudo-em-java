package RPG;
public class Druida extends Personagem {

    public float invocacao;
    public float antropomorfismo;

    public Druida(String nome, float life, float stamina, float mana, float forca, float invocacao,
            float antropomorfismo) {

        this.nome = nome;
        this.life = life;
        this.stamina = stamina;
        this.mana = mana;
        this.invocacao = invocacao;
        this.antropomorfismo = antropomorfismo;

    }

    public void transformacao(){
        if(invocacao<30 && antropomorfismo<30)
        System.out.println("Não é possível completar transformação, medite para recuperar a energia. ");

        else if(invocacao<50 && antropomorfismo<50)
        System.out.println("Você se transformou em um rato, Tem sede de queijo. ");

        else if(invocacao<80 && antropomorfismo<80)
        System.out.println("Você se transformou em um ratel, imune a venenos. ");

        else
        System.out.println("Você se transformou em um urso negro, Tem sede de sangue!");
    }
}