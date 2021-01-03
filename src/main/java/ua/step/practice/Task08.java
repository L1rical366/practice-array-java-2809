package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;


/**
 * Задание: Заполнить массив размерности n случайными строчны-
 * ми (маленькими) латинскими буквами. Подсчитать, сколько раз встреча-
 * ется каждая буква. Вывести буквы, которые встречаются
 * больше 3 раз. n – задается с клавиатуры.
 * <p>
 * Пример вывода:
 * g - 4 раза
 * l - 4 раза
 * s - 5 раз
 * v - 5 раз
 * x - 5 раз
 */
public class Task08 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest08
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        char[] arr;
        // TODO: Пишите код здесь
        arr = new char[len];
        for (int i = 0; i < len; i++) {
            int tmp = rnd.nextInt(122 - 97 + 1) + 97;
            arr[i] = (char)tmp;
        }
        char tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        for (int i = 0, k = 1; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                k++;
            }else if (k > 4) {
                System.out.println(arr[i] + " - " + k + " раз");
                k = 1;
            } else if (k > 3) {
                System.out.println(arr[i] + " - " + k + " раза");
                k = 1;
            }
            else if(k>1){
                k = 1;
            }
            if (i == arr.length - 2 && k > 4) {
                System.out.println(arr[i] + " - " + k + " раз");
            } else if (i == arr.length - 2 && k > 2) {
                System.out.println(arr[i] + " - " + k + " раза");
            }
        }
    }
}

