package banckaccount;

public class Cliente {
    
    private int nome;
    private String cpf;
    private Conta conta_corrente;


    public Cliente (String nome, String CPF){
    this.nome=nome;
    this.CPF=CPF;
    }
    public int getNome() {
        return nome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setNome(int nome) {
        this.nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
