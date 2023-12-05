package edu.neu.mgen;
/**
 * import javax.swing.*; // Importing Swing components for GUI
import java.awt.*;   // Importing AWT for colors and graphics

// Main class for the Color Chooser application
public class Lab3_ColorChooserApp {
    public static void main(String[] args) {
        // Creating the main window (frame) for the application
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting default close operation
        frame.setLayout(new FlowLayout()); // Using FlowLayout for simple linear layout

        // Creating the circle component
        ColorCircle circle = new ColorCircle();
        frame.add(circle); // Adding the circle to the frame

        // Defining color options for the dropdown
        String[] colors = {"Red", "Blue", "Green"};
        // Creating a ComboBox (dropdown) for color selection
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        frame.add(colorComboBox); // Adding the ComboBox to the frame

        // Creating a TextField for displaying the selected color
        JTextField colorTextField = new JTextField(10);
        frame.add(colorTextField); // Adding the TextField to the frame

        // Adding an ActionListener to the ComboBox to handle color selection
        colorComboBox.addActionListener(e -> {
            String selectedColor = (String) colorComboBox.getSelectedItem(); // Getting the selected color
            colorTextField.setText(selectedColor); // Updating the TextField with the selected color

            // Updating the circle's color based on the selection
            switch (selectedColor) {
                case "Red":
                    circle.setColor(Color.RED);
                    break;
                case "Blue":
                    circle.setColor(Color.BLUE);
                    break;
                case "Green":
                    circle.setColor(Color.GREEN);
                    break;
            }
        });

        // Setting the size of the frame and making it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// Custom JPanel class to represent the color circle
class ColorCircle extends JPanel {
    private Color color = Color.WHITE; // Default color of the circle

    // Method to paint the circle on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Calling the superclass method
        g.setColor(color); // Setting the color for the circle
        g.fillOval(10, 10, 100, 100); // Drawing the circle
    }

    // Method to change the color of the circle
    public void setColor(Color color) {
        this.color = color; // Updating the color
        repaint(); // Repainting the circle with the new color
    }
}

 * 
 * import javax.swing.*; // Importing Swing components for GUI
import java.awt.*;   // Importing AWT for colors and graphics

// Main class for the Color Chooser application
public class Lab3_ColorChooserApp {
    public static void main(String[] args) {
        // Creating the main window (frame) for the application
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting default close operation
        frame.setLayout(new FlowLayout()); // Using FlowLayout for simple linear layout

        // Creating the circle component with no initial color
        ColorCircle circle = new ColorCircle();
        frame.add(circle); // Adding the circle to the frame

        // Defining color options for the dropdown, including a 'No Color' option
        String[] colors = {"No Color", "Red", "Blue", "Green"};
        // Creating a ComboBox (dropdown) for color selection
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        frame.add(colorComboBox); // Adding the ComboBox to the frame

        // Creating a TextField for displaying the selected color
        JTextField colorTextField = new JTextField(10);
        frame.add(colorTextField); // Adding the TextField to the frame

        // Adding an ActionListener to the ComboBox to handle color selection
        colorComboBox.addActionListener(e -> {
            String selectedColor = (String) colorComboBox.getSelectedItem(); // Getting the selected color
            colorTextField.setText(selectedColor); // Updating the TextField with the selected color

            // Updating the circle's color based on the selection
            switch (selectedColor) {
                case "Red":
                    circle.setColor(Color.RED);
                    break;
                case "Blue":
                    circle.setColor(Color.BLUE);
                    break;
                case "Green":
                    circle.setColor(Color.GREEN);
                    break;
                default:
                    circle.setColor(null); // Setting no color if 'No Color' is selected
                    break;
            }
        });

        // Setting the size of the frame and making it visible
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}

// Custom JPanel class to represent the color circle
class ColorCircle extends JPanel {
    private Color color; // Initial color is null (no color)

    // Method to paint the circle on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Calling the superclass method
        if (color != null) {
            g.setColor(color); // Setting the color for the circle
            g.fillOval(10, 10, 100, 100); // Drawing the circle
        }
    }

    // Method to change the color of the circle
    public void setColor(Color color) {
        this.color = color; // Updating the color
        repaint(); // Repainting the circle with the new color
    }
}
 */



import javax.swing.*; // Importing Swing components for GUI
import java.awt.*;   // Importing AWT for colors and graphics

// Main class for the Color Chooser application
public class Lab3_ColorChooserApp {
    public static void main(String[] args) {
        // Creating the main window (frame) for the application
        JFrame frame = new JFrame("Color Chooser");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Setting default close operation
        frame.setLayout(new FlowLayout()); // Using FlowLayout for simple linear layout

        // Creating the circle component with no initial color
        ColorCircle circle = new ColorCircle();
        frame.add(circle); // Adding the circle to the frame

        // Defining color options for the dropdown, including a 'No Color' option
        String[] colors = {"No Color", "Red", "Blue", "Green"};
        // Creating a ComboBox (dropdown) for color selection
        JComboBox<String> colorComboBox = new JComboBox<>(colors);
        frame.add(colorComboBox); // Adding the ComboBox to the frame

        // Creating a TextField for displaying the selected color
        JTextField colorTextField = new JTextField(10);
        frame.add(colorTextField); // Adding the TextField to the frame

        // Adding an ActionListener to the ComboBox to handle color selection
        colorComboBox.addActionListener(e -> {
            String selectedColor = (String) colorComboBox.getSelectedItem(); // Getting the selected color
            colorTextField.setText(selectedColor); // Updating the TextField with the selected color

            // Updating the circle's color based on the selection
            switch (selectedColor) {
                case "Red":
                    circle.setColor(Color.RED);
                    break;
                case "Blue":
                    circle.setColor(Color.BLUE);
                    break;
                case "Green":
                    circle.setColor(Color.GREEN); // Explicitly setting the color to green
                    break;
                default:
                    circle.setColor(null); // Setting no color if 'No Color' is selected
                    break;
            }
        });

        // Setting the size of the frame and making it visible
        frame.setSize(400, 250);
        frame.setVisible(true);
    }
}

// Custom JPanel class to represent the color circle
class ColorCircle extends JPanel {
    private Color color; // Initial color is null (no color)

    public ColorCircle() {
        this.setPreferredSize(new Dimension(150, 150)); // Set preferred size for the circle area
    }

    // Method to paint the circle on the panel
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); // Calling the superclass method
        if (color != null) {
            g.setColor(color); // Setting the color for the circle
            g.fillOval(10, 10, 130, 130); // Drawing the circle with specified dimensions
        }
    }

    // Method to change the color of the circle
    public void setColor(Color color) {
        this.color = color; // Updating the color
        repaint(); // Repainting the circle with the new color
    }
}
