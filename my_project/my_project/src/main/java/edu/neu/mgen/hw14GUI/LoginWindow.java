package edu.neu.mgen.hw14GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Define the LoginWindow class that extends JFrame to create a GUI window
public class LoginWindow extends JFrame {

    // CardLayout allows switching between different "cards" or panels within the same container
    private CardLayout cardLayout = new CardLayout();
    // A JPanel that will hold all the cards for the CardLayout
    private JPanel cardPanel = new JPanel(cardLayout);

    // Constructor for LoginWindow
    public LoginWindow() {
        // Set the layout for the cardPanel to CardLayout
        cardPanel.setLayout(cardLayout);

        // Create the login panel and add it to the cardPanel with the identifier "Login"
        JPanel loginPanel = createLoginPanel();
        cardPanel.add(loginPanel, "Login");

        // Create the sign-up panel and add it to the cardPanel with the identifier "SignUp"
        JPanel signUpPanel = createSignUpPanel();
        cardPanel.add(signUpPanel, "SignUp");

        // Add the cardPanel to the JFrame itself
        add(cardPanel);

        // Configure the window settings
        setTitle("Login / Sign Up"); // Set the title of the window
        setSize(300, 200); // Set the size of the window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Define the operation that happens on close
        setLocationRelativeTo(null); // Center the window on the screen
    }

    // Helper method to create and return the login panel
    private JPanel createLoginPanel() {
        // Create a new JPanel with GridLayout for structured layout
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        // Initialize the components for the login form
        JTextField usernameField = new JTextField();
        JPasswordField passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");
        JButton switchToSignUpButton = new JButton("Sign Up");

        // Add an ActionListener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you would add the logic to perform user login
            }
        });

        // Add an ActionListener to the sign-up button that switches to the sign-up panel
        switchToSignUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "SignUp");
            }
        });

        // Add the components to the panel with labels
        panel.add(new JLabel("Username:"));
        panel.add(usernameField);
        panel.add(new JLabel("Password:"));
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(switchToSignUpButton);

        return panel; // Return the fully constructed panel
    }

    // Helper method to create and return the sign-up panel
    private JPanel createSignUpPanel() {
        // Similar setup as the login panel using GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        // Initialize the components for the sign-up form
        JTextField newUsernameField = new JTextField();
        JPasswordField newPasswordField = new JPasswordField();
        JButton signUpButton = new JButton("Create Account");
        JButton switchToLoginButton = new JButton("Back to Login");

        // Add an ActionListener to the sign-up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Here you would add the logic to perform user sign-up
            }
        });

        // Add an ActionListener to the back button that switches to the login panel
        switchToLoginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cardPanel, "Login");
            }
        });

        // Add the components to the panel with labels
        panel.add(new JLabel("New Username:"));
        panel.add(newUsernameField);
        panel.add(new JLabel("New Password:"));
        panel.add(newPasswordField);
        panel.add(signUpButton);
        panel.add(switchToLoginButton);

        return panel; // Return the fully constructed panel
    }

    // Main method to run the application
    public static void main(String[] args) {
        // Schedule a job for the event dispatch thread to create and show this GUI
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of LoginWindow and make it visible
                new LoginWindow().setVisible(true);
            }
        });
    }
}

/**
 * 
 * 
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 * 
 * // Define the LoginWindow class that extends JFrame to create a GUI window
public class LoginWindow extends JFrame {

    // Declare components for the login form
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    // Declare components for the sign-up form
    private JTextField newUsernameField;
    private JPasswordField newPasswordField;
    private JButton signUpButton;

    // Constructor for LoginWindow
    public LoginWindow() {
        // Initialize the username and password fields for login
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        // Initialize the login button and set its text
        loginButton = new JButton("Login");

        // Initialize the username and password fields for sign-up
        newUsernameField = new JTextField();
        newPasswordField = new JPasswordField();
        // Initialize the sign-up button and set its text
        signUpButton = new JButton("Sign Up");

        // Set the layout manager for the window
        setLayout(new GridLayout(5, 2, 5, 5));

        // Add the components for the login form to the window
        add(new JLabel("Username:"));
        add(usernameField);
        add(new JLabel("Password:"));
        add(passwordField);
        add(loginButton);

        // Add the components for the sign-up form to the window
        add(new JLabel("New Username:"));
        add(newUsernameField);
        add(new JLabel("New Password:"));
        add(newPasswordField);
        add(signUpButton);

        // Add an ActionListener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performLogin();
            }
        });

        // Add an ActionListener to the sign-up button
        signUpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performSignUp();
            }
        });

        // Configure the window settings
        setTitle("Login / Sign Up");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    // Method to handle login logic
    private void performLogin() {
        String username = usernameField.getText();
        String password = new String(passwordField.getPassword());

        if (validateCredentials(username, password)) {
            dispose(); // Close the login window
            openChatWindow(username); // Open the chat window
        } else {
            JOptionPane.showMessageDialog(this,
                "Invalid username or password", "Login Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }

    // Method to handle sign-up logic
    private void performSignUp() {
        String newUsername = newUsernameField.getText();
        String newPassword = new String(newPasswordField.getPassword());
        // Insert logic here to handle the sign-up process
    }

    // Placeholder for the actual validation logic
    private boolean validateCredentials(String username, String password) {
        // Here, you would check the username and password against stored credentials
        // For simplicity, we'll just check if they are not empty
        return username != null && !username.trim().isEmpty() && password != null && !password.trim().isEmpty();
    }

    // Method to open the ChatWindow
    private void openChatWindow(String username) {
        ChatWindow chatWindow = new ChatWindow(username); // Pass the username to the chat window
        chatWindow.setVisible(true);
    }

    // Main method to run the application
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginWindow().setVisible(true);
            }
        });
    }
}

 */
