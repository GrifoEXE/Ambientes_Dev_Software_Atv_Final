import operations.Divisao;
import operations.Soma;

public class Main {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        Soma soma = new Soma();
        System.out.println(divisao.dividirDoisValores(1, 2));
        System.out.println(soma.somarDoisValores(1.1,2.5));
    }
}