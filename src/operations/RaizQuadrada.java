package operations;

public class RaizQuadrada {

    Divisao divisao = new Divisao();

    public double calcularRaizQuadrada(double valor) {
        return Math.sqrt(valor);
    }

    public double dividirRaizesQuadradas(double valor1, double valor2) {
        double raiz1 = calcularRaizQuadrada(valor1);
        double raiz2 = calcularRaizQuadrada(valor2);

        return divisao.divide(raiz1, raiz2);
    }

    public int raizcubica(int x) {
        int cont = 0;
        int r = 0;
        while (cont < x) {
            if (cont * cont == x) {
                r = cont;
            }
            cont++;
        }
        return r;
    }

    public int raiz(int x) {
        int cont = 0;
        int r = 0;
        while (cont < x) {
            if (cont * cont == x) {
                r = cont;
            }
            cont++;
        }
        return r;
    }
    public int multiplicaRaiz( int num1, int num2){

        int x = raiz(num1);
        int y = raiz(num2);

        return x*y;

    }
}
