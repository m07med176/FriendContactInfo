
package friendsinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.derby.jdbc.ClientDriver;

public class DatabaseManager {
    Connection conection;
    public DatabaseManager() {
        try {
            DriverManager.registerDriver(new ClientDriver());
            this.conection = DriverManager.getConnection("jdbc:derby://localhost:1527/FriendsInfoDB","root","root");
        } catch (SQLException ex) {
            Logger.getLogger(DatabaseManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Connection getConection() {
        return conection;
    }
      
}
