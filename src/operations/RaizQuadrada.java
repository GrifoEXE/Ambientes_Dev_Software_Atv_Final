package operations;

public class RaizQuadrada {
    public static double calcularRaizQuadrada(double numero) {
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        double numero = 25.0;
        double resultado = calcularRaizQuadrada(numero);
        System.out.println("A raiz quadrada de " + numero + " é " + resultado);
    }
}