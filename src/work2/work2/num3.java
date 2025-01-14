package work2.work2;

import java.util.Arrays;
import java.util.Random;

public class num3 {
    public static void main(String[] args){

        //Задание 3. Посчитать количество чётных чисел в массиве
        Random random = new Random();
        int[] x = new int[10]; // Объявляем массив целых чисел x длиной 10. Будет выполняться столько раз пока i не перестанет удовлетворять условию

            for (int i = 0; i < 10; i++) { // Запускаем цикл от 0 до 9.
                x[i] = random.nextInt(-100, 100); // Генерируем случайное число в диапазоне от -100 до 99 и присваиваем его элементу массива x с индексом i.
            }

            System.out.println(Arrays.toString(x)); //Arrays.toString(x) преобразует массив в строку

        int count = 0; // Объявляем целочисленную переменную count для подсчета четных чисел в массиве.

        for (int i : x){ // Запускаем цикл for-each для перебора каждого элемента массива x.
            if (i % 2 == 0){ // Проверяем, является ли текущий элемент четным.
                count++; // Если да, увеличиваем счетчик на 1.
            }
        }

        System.out.println(count);
    }
}

