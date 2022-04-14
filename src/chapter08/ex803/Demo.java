package chapter08.ex803;

import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        String str = "Программируем на Java";
        char[] symbs = new char[12];
        "Изучаем Pascal".getChars(0, 8, symbs, 0);
        str.getChars(str.length()-4, str.length(), symbs, 8);
        System.out.println(symbs);

        for(int k = str.length()-1; k >= 0; k--) {
            System.out.print("|" + str.charAt(k));
        }
        System.out.println("|");

        byte[] nums;
        nums = "Java".getBytes();
        System.out.println(Arrays.toString(nums));
        symbs = "Java".toCharArray();
        System.out.println(Arrays.toString(symbs));
    }
}
