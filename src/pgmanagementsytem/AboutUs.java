package pgmanagementsytem;
import javax.swing.*;

public class AboutUs extends JFrame {
    
    public AboutUs() {
        setTitle("About Us");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        JTextArea aboutTextArea = new JTextArea(
            "Welcome to our PG management system!\n\n"
            + "At our hotel, we strive to provide the best service to our customers.\n"
            + "Our facilities include:\n"
            + "- Comfortable and luxurious rooms\n"
            + "- Free Wi-Fi\n"
            + "- Air Conditioners\n"
            + "- Refrigerators\n"
            + "- In-Built Kitchen\n"
            + "- Laundary Services\n"
            + "- Security\n\n"
            + "For any inquiries or assistance, feel free to contact us at:\n"
            + "Email: adcg@gmail.com\n"
            + "Phone: +(91) 12344-52628\n\n"
            + "We hope you enjoy your stay with us!"
        );
        aboutTextArea.setEditable(false);
        
        JScrollPane scrollPane = new JScrollPane(aboutTextArea);
        add(scrollPane);
        
        setLocationRelativeTo(null); 
        setVisible(true);
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new AboutUs());
    }
}

