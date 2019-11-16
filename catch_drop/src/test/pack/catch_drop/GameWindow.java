package test.pack.catch_drop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static GameWindow game_window; // GameWindow here is a type of the variable game_window
    private static Image background;
    private static Image drop;
    private static Image gameOver;

    public static void main(String[] args) throws IOException {
        background = ImageIO.read(GameWindow.class.getResourceAsStream("background.png")); // Загружаем картинки используя метод read io
        // а так как read может вызвать исключение, он подчеркнут. Поэтому добавляем в метод main сигнатуру throws IOException
        // загружаем оставшиеся картинки
        drop = ImageIO.read(GameWindow.class.getResourceAsStream("drop.png"));
        gameOver = ImageIO.read(GameWindow.class.getResourceAsStream("gameover.png"));

        game_window = new GameWindow(); // Create object from GameWindow class and put it to variable
        game_window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); //When closing window, program will closed
        game_window.setLocation(200, 100);
        game_window.setSize(906, 478);
        game_window.setResizable(false);
        GameField game_field = new GameField();
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    private static void onRepaint(Graphics g) {
        //g.fillOval(10,10, 200, 100); // рисуем овал
        //g.drawLine(20,20,70,70); // рисуем линию
        g.drawImage(background, 0, 0, null); // рисуем фон, ЛВ угол в точке 0 0
        g.drawImage(drop, 100, 100, null);
        g.drawImage(gameOver, 280, 120, null);

    }
    private static class GameField extends JPanel {

        @Override  // Переопределяем класс JPanel в свой класс GameFielp
        protected void paintComponent(Graphics g) {  // в переменной g содержится объект класса Graphics
            super.paintComponent(g); // достаем метод painComponent b\из оригинала класса JPanel, чтобы нарис. панель
            onRepaint(g);

        }
    }
}
