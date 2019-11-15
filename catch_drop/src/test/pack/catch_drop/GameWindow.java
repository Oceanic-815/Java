package test.pack.catch_drop;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    private static GameWindow game_window; // GameWindow here is a type of the variable game_window
    public static void main(String[] args) {
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
        g.fillOval(10,10, 200, 100);
        g.drawLine(20,20,70,70);
    }
    private static class GameField extends JPanel {

        @Override  // Переопределяем класс JPanel в свой класс GameFielp
        protected void paintComponent(Graphics g) {  // в переменной g содержится объект класса Graphics
            super.paintComponent(g); // достаем метод painComponent b\из оригинала класса JPanel, чтобы нарис. панель
            onRepaint(g);

        }
    }
}
