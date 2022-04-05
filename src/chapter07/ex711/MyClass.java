package chapter07.ex711;

public class MyClass {

    int code;

    void set(int n) {
        code = n;
    }

    void display() {
        System.out.println("Поле: " + code);
    }

    static void show(String t) {
        System.out.println("MyClass: " + t);
    }
}
