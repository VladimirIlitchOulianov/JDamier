package PGUI;

import PGUI.PGame.Board;
import PModel.PGameModel.BoardModel;

import javax.swing.*;

public class Test {
    public static void main(String[] args)
    {
        BoardModel boardModel = new BoardModel();

        Board board = new Board(boardModel);

        JFrame frame = new JFrame();

        frame.setContentPane(board);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
    }
}
