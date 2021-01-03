package ua.step.practice;

import java.util.Scanner;

/**
 * Задание: написать программу, которая проверяет, все ли значения
 * элементов массива различные (не повторяются). Вывести:
 * Yes – если все различные и No – если имеется хоть одно по-
 * вторение.
 * <p>
 * Размер массива задается и инициализируется в начале программы.
 */
public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        // TODO: Пишите код здесь
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        int k = 0;
        leave:
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println("No");
                    k++;
                    break leave;
                }
            }

        }
        if(k == 0) System.out.println("Yes");
    }
}
