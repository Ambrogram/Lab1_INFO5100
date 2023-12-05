import java.sql.DriverManager;
import java.sql.DatabaseMetaData;
import java.sql.Connection;

public class CheckJdbcVersion {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/yourDatabase", "username", "password");
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println("JDBC Driver Name: " + metaData.getDriverName());
            System.out.println("JDBC Driver Version: " + metaData.getDriverVersion());
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
