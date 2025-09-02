import java.sql.*;

public class PreparedStatementExample {
    public static void main(String[] args) {
        // JDBC URL, username and password of MySQL
        String url = "jdbc:mysql://localhost:3306/testdb"; // change DB name
        String user = "root";  // your DB username
        String password = "1234"; // your DB password

        // JDBC variables
        Connection con = null;
        PreparedStatement pst = null;
        ResultSet rs = null;

        try {
            // Load JDBC driver (optional in newer versions)
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish the connection
            con = DriverManager.getConnection(url, user, password);

            // -------- INSERT Example --------
            String insertSQL = "INSERT INTO employees (id, name, salary) VALUES (?, ?, ?)";
            pst = con.prepareStatement(insertSQL);
            pst.setInt(1, 101);
            pst.setString(2, "Alice");
            pst.setDouble(3, 50000.0);
            int rowsInserted = pst.executeUpdate();
            System.out.println(rowsInserted + " row(s) inserted.");

            // -------- UPDATE Example --------
            String updateSQL = "UPDATE employees SET salary = ? WHERE id = ?";
            pst = con.prepareStatement(updateSQL);
            pst.setDouble(1, 60000.0);
            pst.setInt(2, 101);
            int rowsUpdated = pst.executeUpdate();
            System.out.println(rowsUpdated + " row(s) updated.");

            // -------- SELECT Example --------
            String selectSQL = "SELECT id, name, salary FROM employees WHERE id = ?";
            pst = con.prepareStatement(selectSQL);
            pst.setInt(1, 101);
            rs = pst.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                double salary = rs.getDouble("salary");
                System.out.println(id + " | " + name + " | " + salary);
            }

            // -------- DELETE Example --------
            String deleteSQL = "DELETE FROM employees WHERE id = ?";
            pst = con.prepareStatement(deleteSQL);
            pst.setInt(1, 101);
            int rowsDeleted = pst.executeUpdate();
            System.out.println(rowsDeleted + " row(s) deleted.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources in reverse order
            try { if (rs != null) rs.close(); } catch (Exception e) {}
            try { if (pst != null) pst.close(); } catch (Exception e) {}
            try { if (con != null) con.close(); } catch (Exception e) {}
        }
    }
}
