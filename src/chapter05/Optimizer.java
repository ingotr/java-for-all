package chapter05;

public class Optimizer {
    private int arraySize;
    private double regModelParamA;
    private double regModelParamB;
    double[][] data;

    // Метод вычисления значений базовых функций
    // в схеме Лагранжа
    private double psi(int k, double x) {
        double s = 1;
        for (int i = 0; i < k; i++) {
            s *= (x - data[0][i]) / (data[0][k] - data[0][i]);
        }
        for (int i = k + 1; i <= arraySize; i++) {
            s *= (x - data[0][i]) / (data[0][k] - data[0][i]);
        }
        return s;
    }

    // Метод вычисления параметров регрессионной моделей
    private void set() {
        double Sx = 0;
        double Sxy = 0;
        double Sy = 0;
        double Sxx = 0;

        for (int i = 0; i <= arraySize; i++) {
            Sx += data[0][i];
            Sy += data[1][i];
            Sxx += data[0][i] * data[0][i];
            Sxy += data[0][i] * data[1][i];
        }
        regModelParamA = ((arraySize + 1) * Sxy - Sx * Sy) / ((arraySize + 1) * Sxx - Sx * Sx);
        regModelParamB = Sy / (arraySize + 1) - regModelParamA / (arraySize + 1) * Sx;
    }

    // Вычисление значения регрессионной функции
    double approx(double x) {
        return regModelParamA * x + regModelParamB;
    }

    // Метод вычисления значения
    // интерполяционного полинома
    double interp(double x) {
        double s = 0;
        for (int i = 0; i <= arraySize; i++) {
            s += data[1][i] * psi(i, x);
        }
        return s;
    }

    Optimizer(int arraySize) {
        this.arraySize = arraySize;
        data = new double[2][arraySize + 1];
        for (int i = 0; i <= arraySize; i++) {
            data[0][i] = Math.PI * i / arraySize / 2;
            data[1][i] = Math.sin(data[0][i]);
        }
        set();
    }
}
