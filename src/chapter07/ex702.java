package chapter07;

public class ex702 {
    public static void main(String[] args) {
        Calculator R;
        R = new Alpha2();
        System.out.println("5!! = " + R.calc(5));
        R = new Bravo2();
        System.out.println("5! = " + R.calc(5));
    }
}
