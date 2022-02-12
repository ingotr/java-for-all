package chapter01;

public class ex15 {
    public static void main(String[] args) {
        // Расстояние между объектами (км)
        double s1 = 100;
        double s2 = 200;
        // Скорость (км/ч)
        double firstSectorSpeed = 80;
        double averageSpeed = 48;
        // Общее время движения
        double totalTime = (s1 + s2) / averageSpeed;
        // Время движения на первом участке (ч)
        double firstSectorTime = s1 / firstSectorSpeed;
        double secondSectorSpeed = totalTime > firstSectorTime ?
                (s1 + s2) / (totalTime / firstSectorTime) : -1;
        System.out.println("Скорость на втором участке:");
        System.out.println(secondSectorSpeed < 0 ? "Это невозможно!" :
                secondSectorSpeed + " км/ч");
    }
}
