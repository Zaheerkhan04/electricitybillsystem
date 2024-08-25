import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class login extends JFrame implements ActionListener {
    private static final long serialVersionUID = 1L;
	JLabel l1, l2, l3;
    JTextField tf1;
    JPasswordField pf2;
    JButton b1, b2;
    JPanel p1, p2, p3, p4;

    login() {
        super("Login Page");

        // Labels for username and password
        l1 = new JLabel("User Name");
        l2 = new JLabel("Password");

        // Text fields for user input
        tf1 = new JTextField(15);
        pf2 = new JPasswordField(15);

        // Buttons for login and cancel
        ImageIcon ic1 = new ImageIcon(ClassLoader.getSystemResource("images/login.png"));
        Image i1 = ic1.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        b1 = new JButton("Login", new ImageIcon(i1));

        ImageIcon ic2 = new ImageIcon(ClassLoader.getSystemResource("images/cancel.png"));
        Image i2 = ic2.getImage().getScaledInstance(50, 50, Image.SCALE_DEFAULT);
        b2 = new JButton("Cancel", new ImageIcon(i2));

        // Add action listeners to buttons
        b1.addActionListener(this);
        b2.addActionListener(this);

        // Background image
        ImageIcon ic3 = new ImageIcon(ClassLoader.getSystemResource("images/backg.jpg"));
        Image i3 = ic3.getImage().getScaledInstance(340, 370, Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        l3 = new JLabel(icc3);

        // Layout setup
        setLayout(new BorderLayout());

        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();

        // Adding components to the panels
        add(l3, BorderLayout.WEST);
        p2.add(l1);
        p2.add(tf1);
        p2.add(l2);
        p2.add(pf2);
        add(p2, BorderLayout.CENTER);

        p4.add(b1);
        p4.add(b2);
        add(p4, BorderLayout.SOUTH);

        // Set background color
        p2.setBackground(Color.WHITE);
        p4.setBackground(Color.WHITE);

        // Window settings
        setSize(640, 450);
        setLocation(600, 400);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        try {
            // Establish connection to database
            conn c1 = new conn();
            
            // Get user input
            String username = tf1.getText();
            @SuppressWarnings("deprecation")
			String password = pf2.getText();

            // SQL query to check credentials
            String query = "select * from login where username = '" + username + "' and password = '" + password + "'";
            ResultSet rs = c1.s.executeQuery(query);

            // Check if user exists in database
            if (rs.next()) {
                // If valid, open the main application window
                new Project().setVisible(true);
                this.setVisible(false);
            } else {
                // If invalid, show error message
                JOptionPane.showMessageDialog(null, "Invalid login");
                setVisible(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("error: " + e);
        }
    }

    public static void main(String[] args) {
        new login().setVisible(true);
    }
}
