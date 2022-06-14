package Rpg;
public class Bardo extends Personagem {

    public float encanto;
    public float ilusao;
    
    public Bardo(String nome, float life, float stamina, float mana, float encanto, float ilusao){
        
        this.nome = nome;
        this.life = life;
        this.stamina = stamina;
        this.mana = mana;
        this.encanto = encanto;
        this.ilusao = ilusao;
    }

    public void encantar(){
        if(encanto<50)
        System.out.println("Acharam sua música ruim, não tinham tomate e lhe lançaram facas.");
        else
        System.out.println("Todos entram em um sono profundo, de qualquer forma não aproveitam sua arte. :/");
    }
}
