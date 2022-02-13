package chapter01;

import static java.lang.Math.*;

public class ex16 {
    public static void main(String[] args) {
        //гравитационная постоянная
        final double G = 6.672E-11;
        //масса Земли
        final double EARTH_MASS = 5.96e24;
        // радиус Земли
        final double EARTH_RADIUS = 6.37E6;
        //период обращения спутника
        double T = 1.5;
        // высота над поверхностью
        double H;
        // перевод периода в секунды
        T *= 3600;
        // высота в метрах
        H = pow(G * EARTH_MASS * T * T / 4 / PI / PI, (double) 1/3) - EARTH_RADIUS;
        // высотав в километрах
        H = (double)round(H) / 1000;
        System.out.println("Высота орбиты спутника: " + H + " км");
    }
}
