package chapter02;

public class ex214 {
    public static void main(String[] args) {
        int numberAmount = 15;
        int firstNumber = 1;
        int secondNumber = 1;
        System.out.println("Числа Фибоначчи: ");
        System.out.println(firstNumber + " " + secondNumber);
        for(int i = 3; i <= numberAmount; i++) {
            secondNumber = firstNumber + secondNumber;
            firstNumber = secondNumber - firstNumber;
            System.out.println(" " + secondNumber);
        }
    }
}
