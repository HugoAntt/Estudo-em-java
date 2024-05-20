package Sobrecarga.ExemploNome;

public class User {

    private String primeiroNome;
    private String ultimoNome;

    public User(String primeiroNome, String ultimoNome) {
        this.primeiroNome = primeiroNome;
        this.ultimoNome = ultimoNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public String output() {
        return primeiroNome.toUpperCase() + " " + ultimoNome.toUpperCase();
    }

    public String output(boolean mostraUltimoNome) {

        if (mostraUltimoNome)
            return output();

        else
            return primeiroNome.toUpperCase();
    }
}
