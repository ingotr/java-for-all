package chapter01;

import static java.lang.Math.*;

public class ex14 {
    public static void main(String[] args) {
        // ускорение свободного падения
        final double g = 9.8;
        // угол к горизонту в градусах
        double angleToHorizon = 30;
        // масса тела в килограммах
        double m = 0.1;
        // коэффициент сопротивления воздуха
        double gamma = 0.1;
        // скорость тела в метрах в секунду
        double v = 100.0;
        // время в секундах
        double t = 1.0;
        // координаты тела в метрах
        double x;
        double y;
        // переводим градусы в радианы
        angleToHorizon /= 180 / PI;
        // вычисляем координаты
        x = v * m * cos(angleToHorizon) / gamma * (1 - exp(-gamma * t / m));
        y = m * (v * sin(angleToHorizon) * gamma + m * g) / gamma / gamma *
                (1 - exp(-gamma * t / m)) - m * g * t / gamma;

        //обратный перевод в градусы
        angleToHorizon /= PI * 180;
        System.out.printf("Координаты тела для t=%f сек:\nx=%f м\ny=%f + м",
                t, x, y);
        System.out.println("Параметры: ");
        System.out.printf("Угол alpha=%f градусов", angleToHorizon);
        System.out.printf("Скорость V=%f", v);
        System.out.printf("Коэффициент сопротивления воздуха gamma=%f Н*с/м", gamma);
        System.out.printf("Масса тела m=%f", m);
    }
}
