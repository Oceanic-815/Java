package test.pack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    System.out.println("Выберите операцию:");
	    System.out.println("1. Сложение");
	    System.out.println("2. Вычитание");
	    System.out.println("3. Умножение");
        System.out.println("4. Деление");
	    Scanner scanner = new Scanner(System.in);
	    int operation = scanner.nextInt();
        System.out.println("Введите первое число");
        int first_digit = scanner.nextInt();
        System.out.println("Введите второе число");
        int second_digit = scanner.nextInt();
        int result  = 0;
        if (operation == 1) {
            result = first_digit + second_digit;
        }
        else if (operation == 2) {
            result = first_digit - second_digit;
        }
        else if (operation == 3) {
            result = first_digit * second_digit;
        }
        else {
            result = first_digit / second_digit;
        }
            System.out.println("Результат  = " + result);
    }
}
