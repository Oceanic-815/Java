package test.pack.seabattleoop;

public class Field {
    final int SIZE = 10; // Неизменяемая (final) переменная
    char[] cells = new char[SIZE];
    Ship ship;

    void init() {  // Создаем поле размером SIZE
        for (int i = 0; i < cells.length; i++) {
            cells[i] = '.';
        }

    }

    void setShip(Ship ship) { // В поле должен быть корабль. Это он
        this.ship = ship;
        cells[ship.position] = 'X';
    }

    void doShoot(int shoot) { // Метод Выстрел. Принимает переменную, назовем ее shoot
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
    }

    void show() {
        System.out.println(cells);
    }

    boolean isNotGameOver() {
        return cells[ship.position] == 'X';
    }
}
