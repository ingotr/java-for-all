package chapter03;

import java.util.Scanner;

public class ex309 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Текст для кодирования: ");

        String text = input.nextLine();
        char[] symbols = text.toCharArray();
        for(int k = 0; k < symbols.length; k++) {
            symbols[k] = (char)(symbols[k] + k + 1);
        }
        text = new String(symbols);
        System.out.println("После кодирования: ");
        System.out.println(text);
        symbols = text.toCharArray();
        for(int k = 0; k < symbols.length; k++) {
            symbols[k] = (char) (symbols[k] - k - 1);
        }
        text = new String(symbols);
        System.out.println("После декодирования: ");
        System.out.println(text);
    }
}
