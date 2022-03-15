package chapter06;

public class ex612 {
    public static void main(String[] args) {
        MyAbstractClass A = new MyAbstractClass(100) {
            @Override
            void show() {
                System.out.println("Объект A: " + code);
            }
        };

        MyAbstractClass B = new MyAbstractClass(200) {
            @Override
            void show() {
                System.out.println("Объект B: " + code);
            }
        };

        A.show();
        B.show();
        A.code = 150;
        B.code = 250;
        A.show();
        B.show();
    }
}
