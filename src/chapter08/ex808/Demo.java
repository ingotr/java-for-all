package chapter08.ex808;

public class Demo {
    static void show(StringBuffer txt) {
        System.out.println("Длина текста: " + txt.length());
        System.out.println("Объем памяти: " + txt.capacity());
    }

    public static void main(String[] args) {
        StringBuffer A=new StringBuffer("Изучаем Java");
        StringBuffer B=new StringBuffer();
        StringBuffer C=new StringBuffer(30);

        System.out.println("Объект A:");
        show(A);
        System.out.println("Объект B:");
        show(B);
        System.out.println("Объект C:");
        show(C);

        A.insert(8,"C++ и ");
        System.out.println(A);

        A.replace(8,11,"Python");
        System.out.println(A);
        System.out.println("Объект A:");
        show(A);

        A.trimToSize();
        show(A);

        A.setLength(14);
        System.out.println(A);
        show(A);

        A.ensureCapacity(50);
        show(A);

        A.reverse();
        System.out.println(A);
        System.out.println("Объект B:");

        B.append("Python и Basic");
        System.out.println(B);

        B.delete(1,10);
        System.out.println(B);

        B.deleteCharAt(3);
        System.out.println(B);

        B.append('a');
        B.append('l');
        System.out.println(B);
    }
}
