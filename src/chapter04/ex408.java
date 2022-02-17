package chapter04;

public class ex408 {
    public static void main(String[] args) {
        System.out.println("Примеры вычислений: ");
        System.out.println("exp(1) = " + MyMath.Exp(1, 30));

        System.out.println("sin(pi) = " + MyMath.Sin(Math.PI, 100));

        System.out.println("cos(pi/2) = " + MyMath.Cos(Math.PI/2, 100));

        System.out.println("J0(mu1) = " + MyMath.BesselJ(2.404825558, 100));

        //Вычисление коэффициентов для рада Фурье для функции y(x) = x
        int m = 1000;
        double[] a = new double[m];
        double[] b = new double[m + 1];
        b[0] = MyMath.L / 2;

        for(int i = 1; i <= m; i++){
            a[i - 1] = (2 * (i % 2) - 1) * 2 * MyMath.L / Math.PI / i;
            b[i] = -4 * (i % 2) * MyMath.L / Math.pow(Math.PI * i, 2);
        }

        // Вычисление значения функции y(x)=x
        // через синус-ряд Фурье:
        System.out.println("2.0 -> " + MyMath.FourSin(2.0, a));
        // Вычисление значения функции y(x)=x
        // через косинус-ряд Фурье:
        System.out.println("2.0 -> " + MyMath.FourCos(2.0, b));
    }
}
