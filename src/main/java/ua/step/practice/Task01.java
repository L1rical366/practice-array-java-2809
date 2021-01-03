package ua.step.practice;

/**
 * Заполнить массив на 15 элементов числами Фибоначчи.
 * Вывести на консоль только четные элементы массива.
 * <p>
 * Пример вывода:
 * 1 2 5 13 34 89 233 610
 */
public class Task01 {
    public static void main(String[] args) {
        // TODO: Пишите код здесь
        int[] fib = new int[15];
        fib[0] = 1;
        fib[1] = 1;
        for (int i = 2; i < fib.length; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i < fib.length; i += 2) {
            System.out.print(fib[i] + " ");
        }
    }
}