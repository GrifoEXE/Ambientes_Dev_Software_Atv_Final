package operations;

public class Divisao {

RaiQuadrada raizquadrada = new RaizQuadrada

public static double calcularRaizQuadradaEDivisao(double numero1, double numero2) {
        double x = raizquadrada.raiz(numero1);
        double y =raizquadrada.raiz(numero2);
 
        return divisao.dividirDoisValores(x,y);
        
    }

    public double dividirDoisValores(double a, double b) {
        return a / b;
    }


    public double dividirEmSérie(double a, double b, double c) {
        return (dividirDoisValores(a, b)) / c;
    }

    //implementado por outro membro
    public double divisãoPorSubtracao(double a, double b){
        //implementar método da classe Subtração
        return (Double) null;
    }

}
