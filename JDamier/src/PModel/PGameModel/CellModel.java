package PModel.PGameModel;

import javax.swing.*;
import java.awt.*;

public class CellModel extends JPanel {
    private Color color;


    public CellModel(int x, int y) {
        this.add(new JLabel("x : " + x + "  y : " + y));
    }

    public void setColor(Color color) {
        this.color = color;
        this.setBackground(color);
    }
}