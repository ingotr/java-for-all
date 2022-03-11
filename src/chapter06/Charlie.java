package chapter06;

public class Charlie extends Bravo6{
    int charlie;

    Charlie(int a, int b, int c) {
        super(a, b);
        charlie = c;
        System.out.println("Поле charlie: " + charlie);
    }
}
