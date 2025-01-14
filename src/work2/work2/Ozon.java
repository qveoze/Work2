package work2.work2;

public class Ozon {
    public static void main (String[] args){
        for (int i = 0; i < 101; i++) { // Запускаем цикл от 0 до 100.
            if (i % 3 == 0 && i % 5 == 0) { // Если, делится i на 3 и на 5 без остатка.
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) { // Если i делится только на 3 без остатка.
                System.out.println("Fizz");
            } else if (i % 5 == 0) { // Если i делится только на 5 без остатка.
                System.out.println("Buzz");
            }
        }
    }
}


