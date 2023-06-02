package operations;
public class RaizQuadrada {
    public static double calcularRaizQuadrada(double valor) {
        return Math.sqrt(valor);
    }

   /*  public static double somarRaizesQuadradas(double valor1, double valor2) {
        double raiz1 = calcularRaizQuadrada(valor1);
        double raiz2 = calcularRaizQuadrada(valor2);
        return raiz1 + raiz2;
    } */
     
    public int raizcubica(int x) {
        int cont = 0;
        int r=0;
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
        int r=0;
        while (cont < x) {
            if (cont * cont == x) {
                r = cont;
            }
            cont++;
        }
        return r;
    }}
