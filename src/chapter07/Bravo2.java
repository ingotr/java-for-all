package chapter07;

public class Bravo2 implements Calculator {
    public int calc(int n) {
        if (n < 1) {
            return 1;
        } else {
            return n * calc(n - 1);
        }
    }
}
