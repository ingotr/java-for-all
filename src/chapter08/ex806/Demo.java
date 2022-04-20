package chapter08.ex806;

public class Demo {
    public static void main(String[] args) {
        String str=" Программируем на С++ ";
        System.out.println("str: "+str);
        str = str.trim();
        System.out.println("str: "+str);
        String A;
        String B;
        String C;
        String D;
        String E;
        String F;

        A = str.substring(3,8);
        System.out.println("A: "+A);

        B = str.concat(" и Java");
        System.out.println("B: "+B);

        C = B.replace(' ','_');
        System.out.println("C: "+C);

        D = B.toLowerCase();
        System.out.println("D: "+D);

        E = B.toUpperCase();
        System.out.println("E: "+E);

        F = String.join("+","один","два","три");
        System.out.println("F: "+F);

        String[] txt = B.split(" ");
        for (int k = 0; k < txt.length; k++){
            System.out.print("|"+txt[k]);
        }
        System.out.println("|");
    }
}
