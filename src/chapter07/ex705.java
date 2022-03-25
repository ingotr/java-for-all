package chapter07;

public class ex705 {
    public static void main(String[] args) {
        Alpha4 A = new Alpha4() {
            int number;

            public void set(int n) {
                number = n;
            }

            public int get() {
                return number;
            }
        };

        A.set(123);
        System.out.println("Поле: " + A.get());
    }
}
