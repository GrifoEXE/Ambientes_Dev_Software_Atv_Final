package operations;

public class Subtracao {
Soma soma = new Soma ();
public double subtrairDoisValores (double valor1, double valor2) {
return valor1 - valor2;
}
public double subtrairSomaDeValores (double valor1, double valor2, double valor3, double valor4) {
valor1 = valor1 + valor2;
valor3 = valor3 + valor4;
return soma.somarDoisValores (valor1, valor3);
    }
}



