package chapter07;

public interface Alpha {
    int NUMBER = 5;

    void set(int n);
    String get();

    default void show() {
        System.out.println("Результат: " + get());
    }
}
