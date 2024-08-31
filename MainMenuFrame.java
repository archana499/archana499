import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginFrame() {
        setTitle("Login Application");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        // Initialize components
        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");
        messageLabel = new JLabel("");

        // Add components to frame
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(new JLabel("")); // Empty cell
        add(loginButton);
        add(messageLabel);

        // Add button action listener
        loginButton.addActionListener(new LoginButtonActionListener());

        setVisible(true);
    }

    private class LoginButtonActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String username = usernameField.getText();
            String password = new String(passwordField.getPassword());

            // Call method to check credentials
            if (authenticate(username, password)) {
                messageLabel.setText("Login Successful");
                messageLabel.setForeground(Color.GREEN);
            } else {
                messageLabel.setText("Invalid credentials");
                messageLabel.setForeground(Color.RED);
            }
        }

        private boolean authenticate(String username, String password) {
            // Basic authentication logic (replace with actual authentication logic)
            return "admin".equals(username) && "password".equals(password);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LoginFrame::new);
    }
}
