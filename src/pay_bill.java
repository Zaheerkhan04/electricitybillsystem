import java.awt.Dimension;

import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class pay_bill extends JFrame{
    private static final long serialVersionUID = 1L;
	pay_bill(){
        JEditorPane j = new JEditorPane();
        j.setEditable(false);

        try {
            j.setPage("https://paytm.com/electricity-bill-payment");
        }catch (Exception e) {
            j.setContentType("text/html");
            j.setText("<html>Could not load</html>");
        }

        JScrollPane scrollPane = new JScrollPane(j);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(scrollPane);
        setPreferredSize(new Dimension(800,600));
        setSize(800,800);
        setLocation(250,120);
        setVisible(true);
    }
    public static void main(String[] args){
        new pay_bill().setVisible(true);
    }
}