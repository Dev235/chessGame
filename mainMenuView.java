import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.io.File;

public class mainMenuView extends JFrame{
    public mainMenuView() {
        // Set the frame title
        setTitle("Chess Game");
        // Set the frame so that it doesn't resize
        setResizable(false);
        setLayout(new BorderLayout());

        // To keep images you need placeholder
        JLabel imagePlaceholder = new JLabel();
        imagePlaceholder.setPreferredSize(new Dimension(360, 360));
        imagePlaceholder.setBorder(BorderFactory.createEtchedBorder());

        // The actual picture
        ImageIcon imageIcon = new ImageIcon("pics/chessLogo.jpg");
        imagePlaceholder.setIcon(imageIcon);
        imagePlaceholder.setHorizontalAlignment(SwingConstants.CENTER);

        // Creating a panel for the buttons for easier customization
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());

        // Three main menu buttons
        JButton startButton = new JButton("Start \nGame");
        JButton loadButton = new JButton("Load \nGame");
        JButton settingsButton = new JButton("Settings");
        JButton exitButton = new JButton("Exit \nGame");
        

        Font font1 = new Font(Font.SERIF, Font.BOLD, 10);
        startButton.setFont(font1);
        loadButton.setFont(font1);
        settingsButton.setFont(font1);
        exitButton.setFont(font1);
        // Set the size of the buttons
        // Using dimension object cause it standardizes everything and it seems cool :D
        Dimension buttonSize = new Dimension(90, 50);
        startButton.setPreferredSize(buttonSize);
        loadButton.setPreferredSize(buttonSize);
        settingsButton.setPreferredSize(buttonSize);
        exitButton.setPreferredSize(buttonSize);

        // Add buttons to the panel
        buttonPanel.add(startButton);
        buttonPanel.add(loadButton);
        buttonPanel.add(settingsButton);
        buttonPanel.add(exitButton);

        // Add the image placeholder and button panel to the frame
        add(imagePlaceholder, BorderLayout.NORTH);
        add(buttonPanel, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();

        // Center the frame on the screen
        setLocationRelativeTo(null);

        // Make the frame visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Create a new instance of mainMenuView
        new mainMenuView();
    }
}
