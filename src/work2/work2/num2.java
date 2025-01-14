package work2.work2;

import java.util.Arrays;
import java.util.Random;

public class num2 {
    public static void main(String[] args){

        //Задание 2. Найти максимальный элемент массива
        Random random = new Random();
        int[] x = new int[10]; // Объявляем массив целых чисел x длиной 10.

        for (int i = 0; i < 10; i++) { // Запускаем цикл от 0 до 9. Будет выполняться столько раз пока i не перестанет удовлетворять условию
            x[i] = random.nextInt(-100, 100); // Генерируем случайное число в заданном диапазоне и присваиваем его элементу массива x с индексом i.
        }

        System.out.println(Arrays.toString(x)); //Метод Arrays.toString(x) преобразует массив в строку

        int max = x [0]; // max инициализируется первым элементом массива, что гарантирует, что в него будет помещено корректное значение, даже если все числа в массиве отрицательные.

        for (int i : x) { // Запускаем цикл for-each для перебора каждого элемента массива x.
            if (i > max) {
                max = i; // Если текущий элемент i больше, чем max, обновляем max до значения i.
            }
        }
        System.out.println(max);
    }
        }







