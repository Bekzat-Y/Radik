package dz3;

public class Main2 {
    public static void main(String[] args) {
        double[] numbers = {-4, -2, 2, 3, 6, 8};

        for (int i = 0; i < numbers.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                double temp = numbers[i];
                numbers[i] = numbers[minIndex];
                numbers[minIndex] = temp;
            }

            System.out.print("Итерация " + (i + 1) + ": ");
            for (double num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.print("Отсортированный массив: ");
        for (double num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
