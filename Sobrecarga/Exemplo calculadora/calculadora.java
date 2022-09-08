package Sobrecarga.Exemplo calculadora;

public class calculadora {

    public int calcula(int a, int b){
        return a+b;
    }
    public double calcula(double a, double b){
        return a+b;
    }
    public String calcula(String a, String b){
        return a+b;
    }

    public static void main(String[] args) {
        calculadora calc = new calculadora();
        System.out.println(calc.calcula(1, 100));
        System.out.println(calc.calcula(2.5, 47.87));
        System.out.println(calc.calcula("Deu ", "certo!"));
        
    }
    
}
