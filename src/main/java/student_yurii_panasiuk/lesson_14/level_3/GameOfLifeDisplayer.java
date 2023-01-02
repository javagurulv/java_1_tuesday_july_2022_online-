package student_yurii_panasiuk.lesson_14.level_3;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;

public class GameOfLifeDisplayer {
    // The size of each cell in the grid
    private static final int CELL_SIZE = 5;

    // The width and height of the image
    private static final int WIDTH = CELL_SIZE * 50 ;
    private static final int HEIGHT = CELL_SIZE * 50;

    // The boolean array representing the grid
    private boolean[][] grid;

    // Create a BufferedImage to draw the grid on
    BufferedImage image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);

    JFrame frame = new JFrame();
    ImageIcon icon = new ImageIcon(image);
    // Create a JLabel to hold the ImageIcon
    JLabel label = new JLabel(icon);
    Timer timer = new Timer();


     GameOfLifeDisplayer(boolean[][] grid) {
        this.grid = grid;
         frame.setTitle("Game of Life");
         frame.setSize(WIDTH + 100, HEIGHT + 100);
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         // Add the JLabel to the JFrame
         frame.add(label);

         // Display the JFrame
         frame.setVisible(true);
    }
    void draw() {
        Graphics g = image.getGraphics();
         // Iterate through the grid and draw each cell on the image
        for (int y = 0; y < HEIGHT; y += CELL_SIZE) {
            for (int x = 0; x < WIDTH; x += CELL_SIZE) {
                if (grid[y / CELL_SIZE][x / CELL_SIZE]) {
                    // Draw a black cell
                    g.setColor(Color.BLACK);
                } else {
                    // Draw a white cell
                    g.setColor(Color.WHITE);
                }
                g.fillRect(x, y, CELL_SIZE, CELL_SIZE);
            }
        }
    }

     void display() {
        draw();
        // Create a JFrame to display the image

    }
     void startAnimation() {
         JButton stopButton = new JButton("Stop");
         stopButton.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 // Stop the Timer when the "Stop" button is clicked
                 timer.cancel();
             }
         });
         frame.setLayout(new BorderLayout());
         frame.add(stopButton, BorderLayout.NORTH);

         frame.setLocationRelativeTo(null);
         frame.setVisible(true);

        // Update the grid and repaint the image at a fixed interval
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                // Update the grid here
                grid =  new LifeCycle(grid).calculate();
                draw();

                // Update the ImageIcon and repaint the JLabel
                ImageIcon icon = new ImageIcon(image);
                label.setIcon(icon);
                label.repaint();
                // Add the "Stop" button to the JFrame

            }
        }, 0, 1000 / 20); // update the grid and repaint 5 times per second
     }
}

