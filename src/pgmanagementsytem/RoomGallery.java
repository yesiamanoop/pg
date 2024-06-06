package pgmanagementsytem;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;

public class RoomGallery extends JFrame {

    private JLabel basicRoomLabel;
    private JLabel premiumRoomLabel;
    private JLabel luxuryRoomLabel;

    public RoomGallery() {
        super("Room Gallery");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1800, 800);
        setLayout(new GridLayout(1, 3));

        basicRoomLabel = createRoomLabel("Basic Room", ClassLoader.getSystemResource("icons/fifth.jpg"), "Rs.5000/month", "Available Now");
        premiumRoomLabel = createRoomLabel("Premium Room", ClassLoader.getSystemResource("icons/sixth.jpg"), "Rs.11000/month", "Available Soon");
        luxuryRoomLabel = createRoomLabel("Luxury Room", ClassLoader.getSystemResource("icons/seventh.jpg"), "Rs.20000/month", "Available Now");

        add(basicRoomLabel);
        add(premiumRoomLabel);
        add(luxuryRoomLabel);

        setVisible(true);
    }

    private JLabel createRoomLabel(String roomType, URL imagePath, String price, String availability) {
        JLabel label = new JLabel();
        label.setFont(new Font("Tahoma", Font.BOLD, 32));
        label.setText("<html><center><b>" + roomType + "</b><br><br>" + price + "<br>" + availability + "</center></html>");
        label.setHorizontalAlignment(SwingConstants.CENTER);

        
        try {
            BufferedImage image = ImageIO.read(imagePath);
            ImageIcon icon = new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH));
            label.setIcon(icon);

        } catch (IOException e) {
            label.setText("<html><center><b>" + roomType + "</b><br>Image not found</center></html>");
        }

        return label;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RoomGallery());
    }
}
