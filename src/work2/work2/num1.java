package work2.work2;

import java.util.Arrays;
import java.util.Random;

public class num1 {
    public static void main(String[] args){

        // Задание 1. Сумма элементов массива
        Random random = new Random();
        int[] x = new int[10]; // Объявляем массив целых чисел x длиной 10.

        for (int i = 0; i < 10; i++) { // Запускаем цикл от 0 до 9. Будет выполняться столько раз пока i не перестанет удовлетворять условию
            x[i] = random.nextInt(-100, 100); // Генерируем случайное число в заданном диапазоне и присваиваем его элементу массива x с индексом i.
        }

        System.out.println(Arrays.toString(x)); //Метод Arrays.toString(x) преобразует массив в строку

        int sum = 0; // Объявляем переменную sum и приравниванием ее к нулю, чтобы хранить сумму элементов массива.

        for (int i : x) { // Запускаем цикл for-each для перебора каждого элемента массива x.
            sum += i; // Добавляем текущее значение элемента i к переменной sum.
        }

        System.out.println(sum);
    }
}
