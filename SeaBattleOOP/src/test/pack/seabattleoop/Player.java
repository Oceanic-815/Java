package test.pack.seabattleoop;

import java.util.Scanner;

public class Player {
    int getShoot(){
        System.out.println("Куда стрелять?");
        Scanner scanner = new Scanner(System.in);
        String s;
        s = scanner.nextLine();
        System.out.printf("Your input is %s\n", s);
        int shoot = Integer.parseInt(s); // Преобразовываем строку, введенную юзером в Int. Это число - индекс для массива
        return shoot;
    }
}
