
package pgmanagementsytem;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Dashboard extends JFrame{

    public static void main(String[] args) {
        new Dashboard().setVisible(true);
    }

    public Dashboard() {
        super("PG MANAGEMENT SYSTEM");

      
        setLayout(null); 


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/third.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1950, 1000,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2); 
	JLabel NewLabel = new JLabel(i3);
	NewLabel.setBounds(0, 0, 1950, 1000); 
        add(NewLabel);

        JLabel pg = new JLabel("WELCOME");
	pg.setForeground(Color.WHITE);
        pg.setFont(new Font("Tahoma", Font.PLAIN, 96));
	pg.setBounds(600, 60, 1000, 85);
	NewLabel.add(pg);


        JMenuBar menuBar = new JMenuBar();
	setJMenuBar(menuBar);

        JMenu pgSystem = new JMenu("PG MANAGEMENT");
        pgSystem.setForeground(Color.BLUE);
	menuBar.add(pgSystem);
        
	JMenu pgSystemHello = new JMenu("ADMIN");
        pgSystemHello.setForeground(Color.RED);
	menuBar.add(pgSystemHello);

        JMenuItem pgDetailshello1 = new JMenuItem("Rooms");
	pgSystemHello.add(pgDetailshello1);

        pgDetailshello1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new RoomGallery().setVisible(true);
                }catch(Exception e ){}
            }
	});


        JMenuItem pgDetailshello2 = new JMenuItem("Select Room");
	pgSystemHello.add(pgDetailshello2);

        pgDetailshello2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new ChooseRoom().setVisible(true);
                }catch(Exception e ){}
            }
	});
        JMenuItem pgDetailshello3 = new JMenuItem("About Us");
	pgSystemHello.add(pgDetailshello3);

	pgDetailshello3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
                try{
                    new AboutUs().setVisible(true);
                }catch(Exception e ){}
            }
	});


        setSize(1950,1090);
	setVisible(true);
        getContentPane().setBackground(Color.WHITE);
    }
}
