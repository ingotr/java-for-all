package chapter08.ex809;

public class Demo {
    public static void main(String[] args) {
        StringBuilder A = new StringBuilder(30);
        System.out.println("Длина текста: " + A.length());
        System.out.println("Объем памяти: " + A.capacity());
        A.append("Изучаем Java");
        System.out.println(A);
        A.insert(8, "язык ");
        System.out.println(A);
        A.replace(0,3, "y").replace(2, 4, "и");
        System.out.println(A);
        String B = A.toString();
        System.out.println(B);
    }
}
