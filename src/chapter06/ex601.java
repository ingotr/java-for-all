package chapter06;

public class ex601 {
    public static void main(String[] args) {
        Alpha A = new Alpha();
        System.out.println("Объект A");
        A.number = 100;
        A.show();

        Bravo B = new Bravo();
        System.out.println("Объект B");
        B.number = 200;
        B.value = 300;
        B.show();
        B.display();
        B.sum();
    }
}
