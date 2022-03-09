package chapter06;

public class Bravo2 extends Alpha2{
    char symbol;

    void display() {
        System.out.println("Поле symbol: " + symbol);
    }

    Bravo2() {
        super();

        symbol = 'A';
        display();
    }

    Bravo2(int n, char s) {
        super(n);

        symbol = s;
        display();
    }
}
