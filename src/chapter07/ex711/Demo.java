package chapter07.ex711;

public class Demo {
    public static void main(String[] args) {

        MyClass obj = new MyClass();

        Alpha A = MyClass::set;
        Bravo B = MyClass::display;
        Charlie C = MyClass::show;

        obj.set(123);
        B.bravo(obj);
        A.alpha(obj, 321);
        obj.display();
        C.charlie("Hello");
    }
}
