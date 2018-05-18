package PGUI.PGame;

import PModel.PGameModel.BoardModel;
import PModel.PGameModel.CellModel;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class Board extends JPanel implements IBoard{

    BoardModel boardModel;

    public Board (BoardModel boardModel)
    {
        this.boardModel = boardModel;
        this.setLayout(new GridLayout(boardModel.getWidth(), boardModel.getHeight()));
        drawBoard();
    }

    @Override
    public void drawBoard() {
        int width = boardModel.getWidth();
        int height = boardModel.getHeight();
        Vector<Vector<CellModel>> board = boardModel.getBoard();

        for (int i = 0; i < width; i++)
        {
            for (int j = 0; j < height; j++)
            {
                this.add(board.get(i).get(j));
            }
        }
    }

    @Override
    public void clearBoard() {

    }

    @Override
    public void startingPos() {

    }

    @Override
    public void changeColor() {

    }

    @Override
    public void loadPos() {

    }
}
