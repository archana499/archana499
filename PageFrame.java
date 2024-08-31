import javax.swing.*;
import java.awt.*;

public class PageFrame extends JFrame {

    public PageFrame(String pageName) {
        setTitle(pageName);
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Close this window only
        setLayout(new BorderLayout());

        // Display different content based on the page name
        JLabel contentLabel = new JLabel("Welcome to " + pageName, SwingConstants.CENTER);
        contentLabel.setFont(new Font("Arial", Font.BOLD, 24));

        add(contentLabel, BorderLayout.CENTER);

        setVisible(true);
    }
}
