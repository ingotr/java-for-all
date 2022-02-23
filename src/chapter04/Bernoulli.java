package chapter04;

import static java.lang.Math.random;
import static java.lang.Math.sqrt;

public class Bernoulli {
    private int testAmount;
    private double successProbability;
    private boolean[] testResult;
    public void setAll(int testAmount, double successProbability) {
        if (testAmount >= 0) {
            this.testAmount = testAmount;
        }
        else {
            testAmount = 0;
        }
        if (successProbability >= 0 && successProbability <= 1) {
            this.successProbability = successProbability;
        }
        testResult = new boolean[testAmount];

        for (int i = 0; i < testAmount; i++) {
            testResult[i] = random() <= successProbability;
        }
    }

    private int getSuccessCount() {
        int count = 0;
        for (int i = 0; i < testAmount; i++) {
            if (testResult[i]) {
                count++;
            }
        }
        return count;
    }

    public void show() {
        System.out.println("СТАТИСТИКА ДЛЯ СХЕМЫ БЕРНУЛЛИ");
        System.out.println("Испытаний: " + testAmount);
        System.out.println("Вероятность успеха: " + successProbability);
        System.out.println("Успехов: " + getSuccessCount());
        System.out.println("Неудач: "+(testAmount - getSuccessCount()));
        System.out.println("Мат. ожидание: "+ testAmount * successProbability);
        System.out.println("Отклонение: "+sqrt(testAmount * successProbability * (1 - successProbability)));
    }
}
