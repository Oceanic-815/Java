package test.pack;

import java.util.Scanner;

public class SeaBattle {
    public static void main(String[] args) {
        char[] cells = new char[10];
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }
        int position = 4;
        cells[position] = 'X';

        do {
            System.out.println(cells);
            Scanner scanner = new Scanner(System.in);
            String s;
            s = scanner.nextLine();
            System.out.printf("Your input is %s\n", s);
            int shoot = Integer.parseInt(s); // Преобразовываем строку, введенную юзером в Int. Это число - индекс для массива
            switch (cells[shoot]) {
                case '.':
                    System.out.println("Промазал");
                    cells[shoot] = '*';
                    break;
                case 'X':
                    System.out.println("Попал");
                    cells[shoot] = '-';
                    System.out.println(cells);
                    break;
                case '*':
                    System.out.println("Уже стерлял");
                    break;
                default:
                    System.out.println("Ошибка ввода");

            }
        } while(cells[position] == 'X');
    }
}
