
package pgmanagementsytem;
import java.sql.*;  

public class conn {
    Connection c;
    Statement s;

    public conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/pgmanagementsystem", "root", "anoop@1234"); 
            s = c.createStatement(); 
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
 
