package chapter02;

public class ex213 {
    public static void main(String[] args) {
        // верхняя граница для суммы
        int upperSumBorder = 100;
        double exponentArgument = 1;
        double sum = 0;
        double iterationIncrement = 1;

        for (int k = 0; k <= upperSumBorder; k++) {
            sum += iterationIncrement;
            iterationIncrement *= exponentArgument / (k + 1);
        }
        System.out.println("exp("+exponentArgument+")="+sum);
        System.out.printf("exp(%1.1f)=%1.16f", exponentArgument, sum);
    }
}
