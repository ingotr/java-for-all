package chapter04;

public class Matrix {
    // размер матрицы
    private int matrixSize;
    // ссыслка на двумерный массив
    private int[][] matrix;
    void create(int size) {
        this.matrixSize = size;
        matrix = new int[size][size];
    }

    // метод заполнения матрицы
    // случайными числами
    void rand() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }
    }

    // метод заполнения матрицы одним числов
    void value (int a) {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = a;
            }
        }
    }

    // метод циклического заполнения матрицы
    // последовательностью чисел
    void digits() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                matrix[i][j] = (i * matrixSize + j) % 9 + 1;
            }
        }
    }

    // метод заполнения единичной матрицы
    void unit() {
        value(0);
        for (int i = 0; i < matrixSize; i++) {
            matrix[i][i] = 1;
        }
    }

    // метод вычисления следа матрицы
    int trace() {
        int s = 0;
        for (int i = 0; i < matrixSize; i++) {
            s += matrix[i][i];
        }
        return s;
    }

    // метод вычисления определителя матрциы
    int det() {
        int D = 0;

        switch(matrixSize) {
            case 1:
                D = matrix[0][0];
                break;
            case 2:
                D = matrix[0][0] * matrix [1][1] -
                matrix[0][1] * matrix [1][0];
                break;
            default:
                int sign = 1;
                Matrix m;

                for (int k = 0; k < matrixSize; k++) {
                    m = new Matrix();
                    m.create(matrixSize - 1);
                    for (int i = 1; i < matrixSize; i++) {
                        for (int j = 0; j < k; j++) {
                            m.matrix[i - 1][j] = matrix[i][j];
                        }
                        for (int j = k + 1; j < matrixSize; j++) {
                            m.matrix[i - 1][j - 1] = matrix[i][j];
                        }
                    }
                    D += sign * matrix[0][k] * m.det();
                    sign *= (-1);
                }
        }
        return D;
    }

    // метод транспонирования матрицы
    void trans() {
        int s = 0;
        for (int i = 0; i < matrixSize; i++) {
            for (int j = i + 1; j < matrixSize; j++) {
                s = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = s;
            }
        }
    }

    // метод отображения матрицы
    void show() {
        for (int i = 0; i < matrixSize; i++) {
            for (int j = 0; j < matrixSize; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
