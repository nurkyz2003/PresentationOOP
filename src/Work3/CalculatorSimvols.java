package Work3;

public class CalculatorSimvols {
    int x;
    int y;
    String symvol;

    public void summa(){
        System.out.println(x+y);
    }
    public void minus(){
        System.out.println(x-y);
    }
    public void umnojenie(){
        System.out.println(x*y);
    }
    public void delenie(){
        System.out.println((double) x/y);
    }
    public void kaldyk(){
        System.out.println(x%y);
    }
    public void daraja(){
        System.out.println(Math.pow(x,y));
    }
}
