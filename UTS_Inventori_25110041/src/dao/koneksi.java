package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class koneksi {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/db_inventori";
            String user = "root";
            String pass = "";

            return DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            System.out.println("Koneksi gagal : " + e.getMessage());
            return null;
        }
    }

    public static void main(String[] args) {
        Connection conn = getConnection();

        if (conn != null) {
            System.out.println("Koneksi berhasil!");
        } else {
            System.out.println("Koneksi gagal!");
        }
    }
}