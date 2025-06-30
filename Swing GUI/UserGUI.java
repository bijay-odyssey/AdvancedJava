import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserGUI extends JFrame {
    private UserDAO userDAO;
    private JTextArea textArea;
    private JTextField nameField, emailField;

    public UserGUI() {
        userDAO = new UserDAO();

        setTitle("User Management System");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BorderLayout());

        // Create the text area to display users
        textArea = new JTextArea();
        textArea.setEditable(false);
        add(new JScrollPane(textArea), BorderLayout.CENTER);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        // Create input fields
        nameField = new JTextField();
        emailField = new JTextField();
        panel.add(new JLabel("Name:"));
        panel.add(nameField);
        panel.add(new JLabel("Email:"));
        panel.add(emailField);

        // Create buttons
        JButton createButton = new JButton("Create");
        JButton viewButton = new JButton("View Users");
        JButton updateButton = new JButton("Update");
        JButton deleteButton = new JButton("Delete");
        
        panel.add(createButton);
        panel.add(viewButton);
        add(panel, BorderLayout.NORTH);

        // Create button actions
        createButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                userDAO.createUser(name, email);
                nameField.setText("");
                emailField.setText("");
                refreshUserList();
            }
        });

        viewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                refreshUserList();
            }
        });

        setVisible(true);
    }

    private void refreshUserList() {
        textArea.setText(""); // Clear the text area
        for (String user : userDAO.getUsers()) {
            textArea.append(user + "\n");
        }
    }

    public static void main(String[] args) {
        new UserGUI();
    }
}
