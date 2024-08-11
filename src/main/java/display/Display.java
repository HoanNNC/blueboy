package display;

import javax.swing.*;

public class Display extends JFrame {
    private final int DISPLAY_WITH = 500;
    private final int DISPLAY_HEIGHT = 500;

    public Display() {
        GamePanel gamePanel = new GamePanel(DISPLAY_WITH, DISPLAY_HEIGHT);
        this.add(gamePanel);
        this.setSize(DISPLAY_WITH,DISPLAY_HEIGHT);
        this.setLayout(null);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Blue Boy");
    }
}
