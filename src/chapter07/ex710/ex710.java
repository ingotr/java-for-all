package chapter07.ex710;

public class ex710 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        Alpha A = obj::set;
        Bravo B = obj::show;

        A.apply("Красный");
        obj.show();
        obj.set("Желтый");

        B.display();
        obj = new MyClass();
        obj.set("Зеленый");
        B.display();

        A.apply("Синий");
        obj.show();
        B.display();
    }
}
