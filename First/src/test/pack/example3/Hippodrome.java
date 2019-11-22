package test.pack.example3;

import java.util.Random;

public class Hippodrome {
    public static void main(String[] args) {
        Horse[] horses = new Horse[10];
        Random random = new Random();
        for (int i = 0; i < horses.length; i++) {  // itar
            horses[i] = new Horse();
            horses[i].name = "Буцефал" + i;
            horses[i].age = 1 + random.nextInt(10); // случайное число от 1 до 10
            horses[i].speed = 10 + random.nextInt(70); // от 10 до 80
            horses[i].isMale = random.nextBoolean();

        }
        for (Horse horse : horses) { // iter
            horse.ride();
        }
    }
}
