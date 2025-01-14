package work2.work2;

import java.util.Arrays;
import java.util.Random;
public class num5 {
    public static void main(String[] args) {

        //Задание 5. Найти среднее арифметическое элементов массива
        Random random = new Random();
        int[] x = new int[10]; // Объявляем массив целых чисел x длиной 10.

        for (int i = 0; i < 10; i++) { // Запускаем цикл от 0 до 9.
            x[i] = random.nextInt(-100, 100); // Генерируем случайное число в диапазоне от -100 до 99 и присваиваем его элементу массива x с индексом i.
        }
        System.out.println(Arrays.toString(x)); //Arrays.toString(x) преобразует массив в строку

        int sum = 0; // Инициализируем переменную sum для хранения суммы элементов массива.
        for (int i : x) { // Запускаем цикл для перебора каждого элемента массива x.
            sum += i; // Добавляем текущее значение элемента i к переменной sum.
        }

        System.out.println(sum / x.length);
    }
}


