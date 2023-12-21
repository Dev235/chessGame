import javax.swing.*;
import java.awt.*;

public class chessView extends JFrame {
    public chessView() {
        super("Chess");
        setLayout(new BorderLayout(10,10));
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Create the chess board and add it to the center of the frame
        // JPanel top = new JPanel();
        // JPanel right = new JPanel();
        // JPanel left = new JPanel();
        // JPanel bot = new JPanel();

        JPanel board = new JPanel();
        board.setSize(new Dimension(300, 300));
        board.setBackground(Color.BLACK);
        add(board, BorderLayout.CENTER);
        // add(top, BorderLayout.PAGE_START);
        // add(right, BorderLayout.LINE_END);
        // add(left, BorderLayout.LINE_START);
        // add(bot, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        chessView game = new chessView();
        game.setVisible(true);
    }
}
