package test.pack.example1;

public class Main {
    public static void main(String[] args) {
// todo ********** ARRAYS **********
        int[] array1 = {2, 3, 4, 5}; // Example 1 of array

        int[] array2; // Example 2 of array
        array2 = new int[100]; // Assign memory by specifying lenght of array
        array2[0] = 10; // Fill up our array

        char[][] array3quadro;  // Example 3 of array
        array3quadro = new char[3][4];  // [columns][rows]
        System.out.println("Quadro array");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                array3quadro[j][i] = '.';
            }
        }
        array3quadro[1][1] = 'O';
        array3quadro[2][1] = 'X';
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array3quadro[j][i]);
            }
            System.out.println();
        }

// todo ************ SWITCH_CASE *************
        int a = 10;
        int b = 20;
        if (a > b) {
            System.out.println("");
        } else {
            System.out.println("");
        }
        int grade = 50;
        switch (grade) {
            case 5:
                System.out.println("");
                break;
            case 4:
                System.out.println("");
            default:
                System.out.println("");
        }
        while (a != 10) {
            System.out.println("10");
            a++;
        }
        int g = 0;
        int c = ++g + ++g;
        System.out.println(c);
// todo ********* ТАБЛИЦА УМНОЖЕНИЯ *************
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                //System.out.println(i + " * " + j + " == " + i * j);
                System.out.printf("%d * %d == %d\t\t", j, i, j*i);
            }
            System.out.println();
        }
        System.out.printf("Число %d строка %s, дробь %.2f", 100, "JAVA", 0.11111); // %.2f - дробное число с двумя знаками после запятой
// todo *********** OOP **************
        System.out.println("\n");

        // Так создается объект, если конструктор в классе пустой
//        OOP1Cat cat1 = new OOP1Cat(); // Создаем кошку new OOP1Cat и присваиваем переменной cat1 типа OOP1Cat чтобы ее потом использовать
//        cat1.age = 3;
//        cat1.name = "Murka"; // Изменяем свойство объекта Cat
//        cat1.about();

        OOP1Cat cat2 = new OOP1Cat(3, "Jerry", false); // создаем объект cat2 типа OOP1Cat и передаем туда аргументы, которые пойдут в конструктор класса этого объекта
        cat2.about();

        OOP1Cat cat3 = new OOP1Cat(); // Если требуется создать пустой объект из класса, надо создать в этом классе еще один конструктор, но пустой
        cat3.about();



    }
}
// todo **************** ADDITIONAL INFORMATION ******************
// sout+tab - print
// itar+tab - to create loop for array
// iter=tab - same, but shorter. Syntax sugar:
//            for (int number : numbers) {}   =>> means Пробежать по массиву numbers, каждый раз созраняя очередной элемент массива в временную переменную number типа int
// Alt+insert - Generator of something like Constructor, Copyright, Override, etc

