package chapter04;

public class ex409 {
    public static void main(String[] args) {
        DynamicList obj = new DynamicList();
        obj.create(3);

        System.out.println("Проверка значений поля number");
        System.out.println(
                "2-й после начального: "+obj.get(2)
        );
        System.out.println(
                "4-й после начального: "+obj.get(4)
        );
        System.out.println(
                "2-й объект после 1-го: "+obj.next.get(2)
        );
    }
}
