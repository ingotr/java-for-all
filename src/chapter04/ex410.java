package chapter04;

public class ex410 {
    public static void main(String[] args) {
        // Создание объекта:
        Matrix obj = new Matrix();
        // Создание матрицы:
        obj.create(3);
        // Единичная матрица:
        obj.unit();
        System.out.println("Единичная матрица:");
        obj.show();
        // Заполнение одним и тем же числом:
        obj.value(5);
        System.out.println("Все элементы одинаковые:");
        obj.show();
        // Заполнение случайными числами:
        obj.rand();
        System.out.println("Случайные числа:");
        obj.show();
        System.out.println("После транспонирования:");
        // Транспонирование матрицы:
        obj.trans();
        obj.show();
        // Вычисление следа матрицы:
        System.out.println("След матрицы: "+obj.trace());
        // Вычисление определителя матрицы:
        System.out.println(
                "Определитель матрицы: "+obj.det()
        );
        // Новая матрица:
        obj.create(5);
        // Заполнение последовательностью цифр:
        obj.digits();
        System.out.println("Последовательность цифр:");
        obj.show();
        // Вычисление определителя матрицы:
        System.out.println(
                "Определитель матрицы: "+obj.det()
        );
    }
}
