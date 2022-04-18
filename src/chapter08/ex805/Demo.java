package chapter08.ex805;

public class Demo {
    public static void main(String[] args) {
        String str="Всегда слова обдумывая чьи-то\n"+
                "Ты видеть должен, что за ними скрыто.\n"+
                "И помни, что уменье что-то скрыть\n"+
                "Порой ценней уменья говорить!";
        System.out.println(str);
        System.out.println("str.contains(\"а\"): "+
                str.contains("а"));
        System.out.println("str.contains(\"Ы\"): "+
                str.contains("Ы"));
        System.out.println("str.contains(\"должен\"): "+
                str.contains("должен"));
        System.out.println("str.contains(\"ну\"): "+
                str.contains("ну"));
        System.out.println("str.indexOf(\'а\'): "+
                str.indexOf('а'));
        System.out.println("str.lastIndexOf(\'а\'): "+
                str.lastIndexOf('а'));
        System.out.println("str.indexOf(\"то\"): "+
                str.indexOf("то"));
        System.out.println("str.lastIndexOf(\"то\"): "+
                str.lastIndexOf("то"));
        System.out.println("str.indexOf(\'а\',10): "+
                str.indexOf('а',10));
        System.out.println("str.lastIndexOf(\'а\',10): "+
                str.lastIndexOf('а',10));
        System.out.println("str.indexOf(\"то\",30): "+
                str.indexOf("то",30));
        System.out.println("str.lastIndexOf(\"то\",30): "+
                str.lastIndexOf("то",30));
    }
}
