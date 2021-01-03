package ua.step.practice;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Random;

/**
 * Задание: Заполнить массив на 10 элементов случайными числами
 * от -5 до +5. Посчитать количество повторяющихся значений.
 * Вывести на консоль только повторяющиеся элементы (больше одного повторения)
 * и количество повторений.
 * <p>
 * Пример:
 * 0 – 5 раз
 * 2 – 3 раза
 * 7 – 2 раза
 */
public class Task05 {
    public static void main(String[] args) {
        // TODO: не менять стоки ниже - нобходимо для тестирования @see ua.step.homework01.TaskTest05
        long seed = args.length > 0 ? Long.parseLong(args[0]) : LocalDateTime.now().toEpochSecond(ZoneOffset.UTC);

        // Использовать для генерирования элементов массива
        Random rnd = new Random(seed);

        // TODO: Пишите код здесь
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = rnd.nextInt(11) - 5;
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
            if(arr[i] == arr[i + 1]){
                k++;
            }
            else if( k != 1){
                System.out.println(arr[i] + " - " + k + " раза");
                k = 1;
            }
            if(i == arr.length - 2 && k != 1){
                System.out.println(arr[i] + " - " + k + " раза");
            }
        }
    }
}