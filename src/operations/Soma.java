package operations;

import java.util.List;

public class Soma {
    public double somarDoisValores(Double valor1, Double valor2) {
        return valor1 + valor2;
    }

    public double somarListaDeValores(List<Double> valores) {
        return valores.stream().reduce(Double::sum).orElse(0.0);
    }
    
    public double potencia(int numero, int expoente) {
        var mult = new Multiplicacao();
        int resultado = 1;
        int count = 0;

        while (count < expoente) {
            count++;
            resultado = mult.multi(numero, resultado);
        }

        return resultado;
    }
}
