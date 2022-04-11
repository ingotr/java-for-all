package chapter07.ex712;

public class Demo {
    public static void main(String[] args) {
        Alpha A = MyClass::new;

        MyClass obj = A.create(123);
        obj.show();
    }
}
