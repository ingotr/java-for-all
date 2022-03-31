package chapter07;

public class ex707 {
    public static void main(String[] args) {
        Alpha7 A = (String t) -> {
            return t.length();
        };

        Alpha7 B = (String t) -> {
            return (int) t.charAt(0);
        };

        String t = "Java";
        System.out.println("Длина текста: " + A.get(t));
        System.out.println("Код символа: " + B.get(t));
    }
}
