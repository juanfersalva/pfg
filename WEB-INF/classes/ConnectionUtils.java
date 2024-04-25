import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtils {
    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver"); // Assuming Azure SQL 
            String url = "jdbc:sqlserver://pfgjuanfer.database.windows.net:1433;database=pfg;user=juanfer@pfgjuanfer;password={ProyectoFinDeGrado/};encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;";
            String username = "juanfer";
            String password = "ProyectoFinDeGrado/";
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }

    public static Connection close(Connection connection) {
        try {
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}

