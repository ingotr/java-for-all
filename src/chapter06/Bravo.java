package chapter06;

public class Bravo extends Alpha {
    int value;

    void display() {
        System.out.println("Поле value: " + value);
    }

    void sum() {
        System.out.println("Сумма: " + (number + value));
    }
}
