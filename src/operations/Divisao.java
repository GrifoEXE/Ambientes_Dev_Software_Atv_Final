package operations;

import java.util.List;

public class Divisao{
    
    public double prod1;
    public double prod2;

    public double divide(double a, double b){
        this.prod1 = a;
        this.prod2 = b;

        return this.prod1/this.prod2;
    }

    // public divProds(int prod1, int prod2){
    //     this.prod1 = 
    // }

    public double calcularMediaAritmetica(List<Double> valores){
        var soma = new Soma();
        
        return divide(soma.somarListaDeValores(valores), valores.size());
    }
}