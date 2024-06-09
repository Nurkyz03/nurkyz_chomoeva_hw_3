public class Main {
    public static void main(String[] args) {
        double[] numbers = {5.0, 4.0, -3.0, -2.0, 1.0, 2.0, 3.0, -4.0, 5.0, 4.0, 3.0, -2.0, 1.0, 2.0, 3.0};
        double total = 0;
        int count = 0;
        boolean negativeNum = false;
        for (double number : numbers) {
            if (negativeNum && number > 0) {
                total += number;
                count++;
            } else if (number < 0) {
                negativeNum = true;
            }
        }
        if (count > 0) {
            double average = total / count;
            System.out.println("Среднее арифметическое положительных чисел после первого отрицательного: " + average);
        } else {
            System.out.println("После первого отрицательного числа не было найдено положительных чисел.");
        }
    }
}