package chapter07;

public class ex708 {
    public static void main(String[] args) {
        Alpha7 A = t -> t.length();
        Alpha7 B = t -> t.charAt(0);

        String t = "Java";
        System.out.println("Длина текста: " + A.get(t));
        System.out.println("Код символа: " + B.get(t));
    }
}
