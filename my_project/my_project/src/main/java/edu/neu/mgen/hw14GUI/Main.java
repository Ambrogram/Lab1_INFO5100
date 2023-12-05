package edu.neu.mgen.hw14GUI;


import javax.swing.*;

// Main class to start the application
public class Main {
    public static void main(String[] args) {
        // Use SwingUtilities.invokeLater to ensure GUI updates are made on the EDT (Event Dispatch Thread)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                // Create an instance of LoginWindow and make it visible
                LoginWindow loginWindow = new LoginWindow();
                loginWindow.setVisible(true);

                // For demonstration, we're opening the ChatWindow directly.
                // Normally, you'd open it after a successful login attempt.
                ChatWindow chatWindow = new ChatWindow();
                chatWindow.setVisible(true); // Make the chat window visible
            }
        });
    }
}
