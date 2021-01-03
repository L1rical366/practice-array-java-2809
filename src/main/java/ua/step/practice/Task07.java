package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание: Заполнить массив размерности n случайными цифрами
 * от 3 до 13. Подсчитать, сколько раз встречается каждая циф-
 * ра. Вывести результат на экран. n – задается с клавиатуры
 *
 * Пример вывода:
 *      3 - 2 раза
 *      5 - 3 раза
 *      8 - 1 раза
 *      9 - 3 раза
 *      11 - 1 раза
 */
public class Task07 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest07
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int len = scanner.nextInt();

        int[] arr;
        // TODO: Пишите код здесь
        arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = rnd.nextInt(11) + 3;
        }
        for(int i = 0; i < arr.length; i++){
            for(int j = 0, k = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    k = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = k;
                }
            }
        }
        for (int i = 0, k = 1; i < arr.length - 1; i++){
            if(arr[i] == arr[i + 1] ){
                k++;
            }
            else if(arr[i] != arr[arr.length - 1]) {
                System.out.println(arr[i] + " - " + k + " раза");
                k = 1;
            }
            else if(arr[i] == arr[arr.length - 1] ){
                k++;
            }
            if(i + 1 == arr.length - 1) {
                System.out.println(arr[i + 1] + " - " + k + " раза");
            }
        }
    }
}
