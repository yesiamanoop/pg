
package pgmanagementsytem;

import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
public class ChooseRoom extends JFrame{
    JTextField textField,textField_1,textField_2,textField_3,textField_4,textField_5,textField_6,textField_7;
        JComboBox c1;

        public ChooseRoom(){
                setTitle("Room Reservation");
        setSize(800, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel Passportno = new JLabel("NAME");
        Passportno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Passportno.setBounds(60, 30, 150, 27);
        add(Passportno);

        textField = new JTextField();
        textField.setBounds(220, 30, 150, 27);
        add(textField);

        JButton Next = new JButton("SAVE");
        Next.setBounds(220, 480, 150, 30);
        Next.setBackground(Color.BLACK);
        Next.setForeground(Color.WHITE);
        add(Next);

        JLabel Pnrno = new JLabel("AGE");
        Pnrno.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Pnrno.setBounds(60, 80, 150, 27);
        add(Pnrno);

        textField_1 = new JTextField();
        textField_1.setBounds(220, 80, 150, 27);
        add(textField_1);

        JLabel Gender = new JLabel("GENDER");
        Gender.setFont(new Font("Tahoma", Font.PLAIN, 17));
        Gender.setBounds(60, 130, 150, 27);
        add(Gender);

        JRadioButton NewRadioButton = new JRadioButton("MALE");
        NewRadioButton.setBackground(Color.WHITE);
        NewRadioButton.setBounds(220, 130, 70, 27);
        add(NewRadioButton);

        JRadioButton Female = new JRadioButton("FEMALE");
        Female.setBackground(Color.WHITE);
        Female.setBounds(300, 130, 90, 27);
        add(Female);

        JLabel room = new JLabel("ROOM TYPE");
        room.setFont(new Font("Tahoma", Font.PLAIN, 17));
        room.setBounds(60, 180, 150, 27);
        add(room);

        String[] course = {"One-Seater(Basic)", "One-Seater(Premium)", "One-Seater(Luxury)", "Two-Seater(Basic)", "Two-Seater(Premium)", "Two-Seater(Luxury)", "Three-Seater(Basic)", "Three-Seater(Premium)", "Three-Seater(Luxury)", "Four-Seater(Basic)", "Four-Seater(Premium)", "Four-Seater(Luxury)"};
        c1 = new JComboBox<>(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(220, 180, 250, 30);
        add(c1);

        JLabel ph = new JLabel("PHONE");
        ph.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ph.setBounds(60, 230, 150, 27);
        add(ph);

        textField_3 = new JTextField();
        textField_3.setBounds(220, 230, 150, 27);
        add(textField_3);

        JLabel ad = new JLabel("AADHAR");
        ad.setFont(new Font("Tahoma", Font.PLAIN, 17));
        ad.setBounds(60, 280, 150, 27);
        add(ad);

        textField_4 = new JTextField();
        textField_4.setBounds(220, 280, 150, 27);
        add(textField_4);

        JLabel email = new JLabel("EMAIL");
        email.setFont(new Font("Tahoma", Font.PLAIN, 17));
        email.setBounds(60, 330, 150, 27);
        add(email);

        textField_5 = new JTextField();
        textField_5.setBounds(220, 330, 150, 27);
        add(textField_5);

        JLabel sd = new JLabel("START DATE");
        sd.setFont(new Font("Tahoma", Font.PLAIN, 17));
        sd.setBounds(60, 380, 150, 27);
        add(sd);

        textField_6 = new JTextField();
        textField_6.setBounds(220, 380, 150, 27);
        add(textField_6);

        JLabel d = new JLabel("DURATION");
        d.setFont(new Font("Tahoma", Font.PLAIN, 17));
        d.setBounds(60, 430, 150, 27);
        add(d);

        textField_7 = new JTextField();
        textField_7.setBounds(220, 430, 150, 27);
        add(textField_7);

        JLabel Add = new JLabel("RECORD");
        Add.setForeground(Color.BLUE);
        Add.setFont(new Font("Tahoma", Font.PLAIN, 31));
        Add.setBounds(450, 24, 442, 35);
        add(Add);



            ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/fourth.jpg"));
            Image i3 = i1.getImage().getScaledInstance(500, 500,Image.SCALE_DEFAULT);
            ImageIcon i2 = new ImageIcon(i3);
            JLabel image = new JLabel(i2);
            image.setBounds(410,80,480,410);
            add(image);


            Next.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent ae){
                    String name = textField.getText();
                    String age = textField_1.getText();
                    String ph = textField_3.getText();
                    String ad = textField_4.getText();
                    String email = textField_5.getText();
                    String sd = textField_6.getText();
                    String d = textField_7.getText();
                    String gender = null;

                    if(NewRadioButton.isSelected()){
                        gender = "male";

                    }else if(Female.isSelected()){
                        gender = "female";
                    }


                    String s6 = (String)c1.getSelectedItem();

                    try {
                        conn c = new conn();
                        String str = "INSERT INTO room values( '"+name+"', '"+age+"', '"+gender+"','"+s6+"', '"+ph+"','"+ad+"', '"+email+"','"+sd+"','"+d+"')";

                        c.s.executeUpdate(str);
                        JOptionPane.showMessageDialog(null,"RECORDED");
                        setVisible(false);

                    } catch (Exception e) {
                        e.printStackTrace();
        	    }
		}
            });

            setSize(900,600);
            setVisible(true);
            setLocation(530,200);

	}

    public static void main(String[] args){
        new ChooseRoom();
    }   
}

