package Config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetProvider;
import net.proteanit.sql.DbUtils;

public class config {

    // 1. Establishing Connection
    public static Connection connectDB() {
        try {
            Class.forName("org.sqlite.JDBC");
            // Ensure this filename matches your database file in the project folder
            return DriverManager.getConnection("jdbc:sqlite:scholarshipDB.db");
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
            return null;
        }
    }

    // 2. Helper for manual connections if needed
    public Connection getConnection() {
        return connectDB();
    }

    /**
     * FETCH DATA (Safe Version)
     * This version uses CachedRowSet so the database connection closes 
     * immediately while still letting you read the data in your forms.
     */
    public ResultSet getData(String sql) throws SQLException {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            
            CachedRowSet crs = RowSetProvider.newFactory().createCachedRowSet();
            crs.populate(rs);
            return crs;
        }
    }

    /**
     * UPDATE RECORD
     * Used for editing profiles or scholarship details.
     */
    public void updateRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }
            pstmt.executeUpdate();
            System.out.println("Record updated successfully!");
        } catch (SQLException e) {
            System.out.println("Error updating record: " + e.getMessage());
        }
    }

    /**
     * ADD / INSERT RECORD
     * Used for registering users or adding scholarships.
     */
    public void addRecord(String sql, Object... values) {
        try (Connection conn = connectDB(); 
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }
            pstmt.executeUpdate();
            System.out.println("Record added successfully!");
        } catch (SQLException e) {
            System.out.println("Error adding record: " + e.getMessage());
        }
    }

    /**
     * DISPLAY DATA IN JTABLE
     * Automatically fills your JTable and closes the connection.
     */
    public void displayData(String sql, javax.swing.JTable table) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql);
             ResultSet rs = pstmt.executeQuery()) {
            table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException e) {
            System.out.println("Error displaying data: " + e.getMessage());
        }
    }

    /**
     * AUTHENTICATE / LOGIN
     * Returns the user 'type' (Admin/Student) if login is successful.
     */
    public String authenticate(String sql, Object... values) {
        try (Connection conn = connectDB();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            for (int i = 0; i < values.length; i++) {
                pstmt.setObject(i + 1, values[i]);
            }
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return rs.getString("type");
                }
            }
        } catch (SQLException e) {
            System.out.println("Login Error: " + e.getMessage());
        }
        return null;
    }

    /**
     * DELETE DATA
     * Removes a record from a specific table.
     */
    public void deleteData(int id, String table, String column) {
        String sql = "DELETE FROM " + table + " WHERE " + column + " = ?";
        try (Connection conn = connectDB(); 
             PreparedStatement pst = conn.prepareStatement(sql)) {
            pst.setInt(1, id);
            int rowsDeleted = pst.executeUpdate();
            if (rowsDeleted > 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Deleted Successfully!");
            }
        } catch (SQLException ex) {
            if (ex.getMessage().contains("locked") || ex.getMessage().contains("busy")) {
                 javax.swing.JOptionPane.showMessageDialog(null, "Database is busy. Close other windows.");
            }
            System.out.println("Delete Error: " + ex.getMessage());
        }
    }
}