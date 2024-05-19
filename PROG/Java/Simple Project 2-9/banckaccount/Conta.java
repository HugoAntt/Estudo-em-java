package banckaccount;

public class Conta {
    private int agencia;
    private double saldo;
    private String nome;
    private String cpf;
   // private Conta conta_corrente;

   public Conta(String nome)
   {
       this.nome= nome;
       this.saldo=0;
   }

    this.nome=nome;
    this.CPF=CPF;
    
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

    
}
