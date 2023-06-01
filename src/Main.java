import operations.Divisao;
import operations.Multiplicacao;

public class Main {
    public static void main(String[] args) {
        Divisao divisao = new Divisao();
        Multiplicacao multiplicacao = new Multiplicacao();
        System.out.println(divisao.divide(1, 2));
        System.out.print(multiplicacao.multi(5,4));

    }
}