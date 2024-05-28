/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connector;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Connector {
    static Connection connect;
    public static Connection getConnection() {
        if (connect == null) {
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setDatabaseName("db_zoo");
            dataSource.setUser("root");
            dataSource.setPassword("");
            try {
                connect = dataSource.getConnection();
                System.out.println("Koneksi Berhasil!");
            } catch (SQLException ex) {
                ex.printStackTrace();
                System.out.println("Koneksi Gagal!");
            }
        }
        return connect;
    }
}
