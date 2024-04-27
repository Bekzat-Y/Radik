package dz3;

public class Main {
    public static void main(String[] args) {
        double[] numbers = {8, -2, -4, 2, 3, 6};

        double sum = 0;
        boolean negativeFound = false;

        for (double number : numbers) {
            if (negativeFound && number > 0) {
                sum += number;
            } else if (number < 0) {
                negativeFound = true;
            }
        }

        int count = 0;
        for (double number : numbers) {
            if (negativeFound && number > 0) {
                count++;
            }
        }

        double average = sum / count;

        System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
    }
}
