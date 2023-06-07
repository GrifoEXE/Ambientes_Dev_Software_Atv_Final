import operations.Divisao;
import operations.RaizQuadrada;

public class Main {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        RaizQuadrada raizQuadrada = new RaizQuadrada();
        System.out.println(divisao.divide(1, 2));
        System.out.println(raizQuadrada.multiplicaRaiz(81,25));
    }
}