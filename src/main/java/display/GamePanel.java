package display;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    GamePanel(int displayWith, int displayHeight) {
        this.setBounds(0,0,displayWith,displayHeight);
        this.setBackground(Color.black);
    }
}
