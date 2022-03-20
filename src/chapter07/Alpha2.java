package chapter07;

public class Alpha2 implements Calculator{
    public int calc(int n) {
        if (n == 1 || n == 2) {
            return n;
        } else {
            return n * calc(n - 2);
        }
    }
}
