package chapter08.ex802;

public class Demo {
    public static void main(String[] args) {
        MyClass A = new MyClass("Первый", 100, 'A');
        System.out.println(A);
        MyClass B = new MyClass("Второй", 200, 'B');
        System.out.println(B);
        String str = "Создан новый объект\n" + B;
        System.out.println(str);
    }
}
