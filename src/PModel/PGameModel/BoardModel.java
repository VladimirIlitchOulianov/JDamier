package PModel.PGameModel;

import java.awt.*;
import java.util.Vector;

public class BoardModel {
    private Vector<Vector<CellModel>> board = new Vector<>();
    private int width = 10;
    private int height = 10;

    public BoardModel()
    {
        initBoardVector();
    }

    private void initBoardVector()
    {
        boolean swapColor = true;
        for (int i = 0; i < height; i++)
        {
            board.add(new Vector<CellModel>());
            for (int j = 0; j < width; j++)
            {
                CellModel cell = new CellModel(i, j);
                if (swapColor)
                {
                    cell.setColor(Color.WHITE);
                }
                else {
                    cell.setColor(Color.BLACK);
                }
                board.get(i).add(cell);
                swapColor = !swapColor;
            }
            swapColor = !swapColor;
        }
    }

    public Vector<Vector<CellModel>> getBoard() {
        return board;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
