import java.sql.Connection;
public class prueba {
    public static void main(String[] args) {
        try (Connection connection = ConnectionUtils.getConnection()) {
            if (connection != null) {
                System.out.println("Connection established successfully!");
            } else {
                System.out.println("Connection failed. Check your configuration.");
            }
        } catch (Exception e) {
            System.out.println("Connection error:");
            e.printStackTrace();
        }
    }
}
