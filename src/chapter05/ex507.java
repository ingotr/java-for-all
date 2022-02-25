package chapter05;

public class ex507 {
    public static void main(String[] args) {
        double x;
        int n = 4;
        int N = 2 * n;
        Optimizer obj = new Optimizer(n);

        System.out.printf("%60s", "Таблица значений:\n");
        System.out.printf("%25s", "Аргумент x");
        System.out.printf("%25s", "Функция y=sin(x)");
        System.out.printf("%25s", "Интерп. полином L(x)");
        System.out.printf("%25s", "Регр. функция f(x)\n");
        for (int i = 0; i <= N; i++) {
            x = i * Math.PI / N / 2;
            System.out.printf("%25s", x);
            System.out.printf("%25s", Math.sin(x));
            System.out.printf("%25s", obj.interp(x));
            System.out.printf("%25s", obj.approx(x) + "\n");
        }
    }
}
