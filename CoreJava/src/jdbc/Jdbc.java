package jdbc;

import java.sql.*;

public class Jdbc {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String password = "passwd";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Connected");

            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                        rs.getString("name"));
            }

            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
