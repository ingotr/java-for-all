package chapter07;

public class MyClass implements Alpha{
    private int code;

    public void set(int n) {
        if (n >= 0) {
            code = n;
        }
        System.out.println("Число: " + code);
    }

    public String get() {
        StringBuilder res = new StringBuilder("|");
        int num = code;
        do {
            res.insert(0, "|" + (num % NUMBER));
            num /= NUMBER;
        } while (num > 0);
        return res.toString();
    }
}
