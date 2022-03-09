package chapter06;

public class Alpha2 {
    int number;

    void show() {
        System.out.println("Поле number: " + number);
    }

    Alpha2() {
        number = 100;
        show();
    }

    Alpha2(int n) {
        number = n;
        show();
    }
}
