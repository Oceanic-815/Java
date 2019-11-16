package test.pack.catch_drop;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

public class GameWindow extends JFrame {
    private static GameWindow game_window; // GameWindow here is a type of the variable game_window
    private static long last_frame_time; // переменная для подсчета времени который прошел между кадрами
    private static Image background;
    private static Image drop;
    private static Image gameOver;
    private static float drop_left = 200; // координата Х капли
    private static float drop_top = -100; // координата У капли (верхняя граница капли)
    private static float drop_v = 200; // Скорость капли
    private static int score;

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
        last_frame_time = System.nanoTime(); // присваиваем началное значение в наносекундах (текущее время)
        GameField game_field = new GameField();
        game_field.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) { // mousePressed вызывается тогда. когда произойдет нажатие мыши
                int x = e.getX(); // получаем координаты нажатия мыши
                int y = e.getY();
                float drop_right = drop_left + drop.getWidth(null); // узнаем ширину капли
                float drop_bottom = drop_top + drop.getHeight(null); // узнаем высоту капли, чтобы понять. попала ли мышь туда
                boolean is_drop = x >= drop_left && x <= drop_right && y >= drop_top && y <= drop_bottom; // если это выражение true, то is_drop = тру, если false, то is_drop = фолс
                if (is_drop) {
                    drop_top = -100; // Если попали, то ресетим каплю за пределы окна
                    drop_left = (int) (Math.random() * (game_field.getWidth() - drop.getWidth(null))); // Генерируем рандомное положение по горизонтали в пределах ширины поля
                    drop_v = drop_v + 20; // увеличиваем скорость движения капли
                    score ++; // прибавляем 1 очек
                    game_window.setTitle("Your score: " + score); // И выводим score в title игрового окна
                }
            }
        });
        game_window.add(game_field);
        game_window.setVisible(true);
    }
    private static void onRepaint(Graphics g) {
        long current_time = System.nanoTime(); // Определяем текущее время
        float delta_time = (current_time - last_frame_time) * 0.000000001f; // вычисляем дельту и переводим наносек в сек
        last_frame_time = current_time; // время предыдущего кадра = текущее время
        drop_top = drop_top + drop_v * delta_time; // вычисляем текущую координату и присваиваем к капле для полета сверху вниз
        //drop_left = drop_left + drop_v * delta_time;

        //g.fillOval(10,10, 200, 100); // рисуем овал
        //g.drawLine(20,20,70,70); // рисуем линию
        g.drawImage(background, 0, 0, null); // рисуем фон, ЛВ угол в точке 0 0
        g.drawImage(drop, (int) drop_left, (int) drop_top, null); // рисуем каплю. конвертим float в int, чтобы работало
        if (drop_top > game_window.getHeight()) g.drawImage(gameOver, 280, 120, null); // когда капля вылетает за границу окна, показать гейм овер
    }

    private static class GameField extends JPanel {

        @Override  // Переопределяем класс JPanel в свой класс GameFielp
        protected void paintComponent(Graphics g) {  // в переменной g содержится объект класса Graphics
            super.paintComponent(g); // достаем метод painComponent b\из оригинала класса JPanel, чтобы нарис. панель
            onRepaint(g); //
            repaint(); // для более частого вызова метода onRepaint()
        }
    }
}
