import java.util.Scanner;
public class Calc {
   
    static public void main(string[] args){

        Scanner scan=new Scanner(System.in);

        Numero n1=new Numero();
        Numero n2=new Numero();
        Numero resultado=new Numero();
        String opc="S";

        
        while(opc.equals("s") || opc.equals("S"))
        system.out.printf("%nDigite o valor 1: ");
        n1.setValor(scan.nextInt());
        system.out.printf("%nDigite o valor 2: ");
        n2.setValor(scan.nextInt());
        resultado.setValor(n1.getValor() - n2.getValor())
        system.out.printf("%nA RESULTADO:",n1.getValor(),n2.getValor(), resultado.getValor());
        system.out.printf("%nRepetir operação?");
        opc.scan.next();
        system.out.printf("%n%n%n");

    }
}
