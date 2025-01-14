package work2.work2;

import java.util.Arrays;
import java.util.Random;

public class num4 {
    public static void main(String[] args){

        //Задание 4. Поменять местами первый и последний элемент массива
        Random random = new Random();
        int[] x = new int[10]; // Объявляем массив целых чисел x длиной 10.

        for (int i = 0; i < 10; i++) { // Запускаем цикл от 0 до 9. Будет выполняться столько раз пока i не перестанет удовлетворять условию
            x[i] = random.nextInt(-100, 100); // Генерируем случайное число в заданном диапазоне и присваиваем его элементу массива x с индексом i.
        }

        System.out.println(Arrays.toString(x)); //Arrays.toString(x) преобразует массив в строку

        // Перестановка
        int k = x[0]; // Сохраняем значение первого элемента массива x в переменной k.
        x[0] = x[x.length - 1]; // Присваиваем значение последнего элемента массива первому элементу массива.
        x[x.length - 1] = k; // Присваиваем сохраненное значение первого элемента последнему элементу массива.

        System.out.println(Arrays.toString(x));
    }
}
