package kata5P2.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class MailListReaderDDBB {
    
    public static List<String> read() throws ClassNotFoundException, SQLException {
        Class.forName("org.sqlite.JDBC");
        String url = "jdbc:sqlite:C:\\Users\\usuario\\Documents\\NetBeansProjects\\Kata4\\KATA.sDB";
        Connection cn = DriverManager.getConnection(url);
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM MAIL");
        List<String> mails = new ArrayList<>();
        
        while(rs.next()) {
            mails.add(rs.getString(2));
        }
        return mails;
    }
}
