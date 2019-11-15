package test.pack.guess.number;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
//private - модификатор ограничивает видимость метода/переменной в пределах одного класса.
// Метод main() всегда public
//static - модификатор указывающий что сущность находится в классе, а не в объекте
//void ключевое слово указывает, что метод не возвращает значение

    public static void main(String[] args) {
        for (int i = 10; i <= 30; i += 10) {

        }
//        System.out.println("Try to guess number");
//        int range = 1000;
//        int number = (int)(Math.random() * range); // (int) converts output to INT, * range is a range to generate a num
//        playLevel(range, number);
//        scanner.close();
    }
    private static void playLevel(int range, int number) {
        while(true) {
            System.out.println("Guess number between 0 and " + range);
            int inputNumber = scanner.nextInt();
            if (inputNumber == number) {
                System.out.println("Success!");
                break;
            }
            else if (inputNumber > number) {
                System.out.println("Target number is less");
            }
            else {
                System.out.println("Target number is greater");
            }
        }
    }
}
