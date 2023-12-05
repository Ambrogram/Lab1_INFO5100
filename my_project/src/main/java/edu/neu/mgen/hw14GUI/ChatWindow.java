package edu.neu.mgen.hw14GUI;

import javax.swing.*; // Import for Swing components
import java.awt.*; // Import for layout and toolkit classes
import java.awt.event.ActionEvent; // Import for handling action events
import java.awt.event.ActionListener; // Import for action listener interface

public class ChatWindow extends JFrame {
    private JTextArea chatArea; // Area to display chat messages
    private JTextField inputField; // Field for typing messages

    public ChatWindow() {
        setTitle("Chat"); // Set the title of the chat window
        setSize(400, 300); // Set the size of the chat window
        setDefaultCloseOperation(EXIT_ON_CLOSE); // Set the default close operation
        setLocationRelativeTo(null); // Center the window

        chatArea = new JTextArea(); // Initialize the chat area
        chatArea.setEditable(false); // Make the chat area non-editable
        inputField = new JTextField(); // Initialize the input field

        setLayout(new BorderLayout()); // Set the layout of the chat window
        add(new JScrollPane(chatArea), BorderLayout.CENTER); // Add chat area with a scroll pane in the center
        add(inputField, BorderLayout.SOUTH); // Add input field at the bottom

        // Add action listener to inputField
        inputField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String message = inputField.getText(); // Get text from input field
                sendMessage(message); // Send the message
                inputField.setText(""); // Clear the input field
            }
        });
    }

    private void sendMessage(String message) {
        // Method to handle sending of messages
        // Here, you would add the logic to actually send the message to the server
        chatArea.append("You: " + message + "\n"); // Append the message to the chat area
    }
}

