package operations;

import java.util.List;

public class Divisao{
    
    public int prod1;
    public int prod2;

    public int divide(int a, int b){
        this.prod1 = a;
        this.prod2 = b;

        return this.prod1/this.prod2;
    }

    // public divProds(int prod1, int prod2){
    //     this.prod1 = 
    // }

    public double calcularMediaAritmetica(List<Double> valores){
        var soma = new Soma();
        return soma.somarListaDeValores(valores) / valores.size();
    }
}