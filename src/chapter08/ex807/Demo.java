package chapter08.ex807;

public class Demo {
    public static void main(String[] args) {
        int num = 54321;
        double val = 12.34567;
        char symb = 'R';
        String txt = "Java";

        String A = String.format(
                "Целое число %1$+010d и символ%2$4c", num, symb);
        String B = String.format(
                "Текст \"%1$-7s\" и число %2$e", txt,val
        );
        String C = String.format(
                "Число %1$07x - это то же, что и %1$07o", num
        );
        String D = String.format(
                "Число: %1$ d \nЧисло: %2$ d", num, -num
        );
        String E = String.format(
                "Действительное число: %012.3f", val
        );
        String F = String.format(
                "Научная нотация: %12.3e", val
        );
        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);
    }
}
