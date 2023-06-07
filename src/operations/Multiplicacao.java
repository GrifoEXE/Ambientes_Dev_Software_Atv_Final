package operations;

public class Multiplicacao {
    public int multi(int x, int y){
        return  x * y;
    }
    public int fatorial(int x){
        if(x==0) {
            return 1;
        }
        return x * fatorial(x-1);
    }

}
