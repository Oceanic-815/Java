package test.pack.seabattleoop;

public class Main {
    public static void main(String[] args) {
// Игровой цикл
        Field field = new Field(); // Создали игровое поле
        Player player = new Player(); // Создаем игрока
        Ship ship = new Ship(4); // Создаем корабль в позиции 4. Позицию создаем в конструкторе класса Ship
        field.init(); // Создаем клетки поля
        field.setShip(ship); // Устанавливаем корабль

        System.out.println("Игра началась");

        do {
            field.show();
            int shootCoordinate = player.getShoot(); // Сохраняем координату выстрела
            field.doShoot(shootCoordinate); // Говорим полу выстрелить по указанной координате
        } while (field.isNotGameOver()); // Пока поле isNotGameOver, продолжаем играть
    }
}
