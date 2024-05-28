/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Connector.Connector;
import DAOImplement.HewanImplement;
import Data.DataHewan;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author afriz
 */
public class ModelHewan implements HewanImplement{
    Connection connection;
    final String select = "SELECT * FROM tbl_hewan";
    final String insert = "INSERT INTO `tbl_hewan` (nama_hewan, jenis_kelamin, umur, asal, tgl_masuk, nama_kandang) VALUES (?, ?, ?, ?, ?, ?);";
    final String update = "update tbl_hewan set nama_hewan=?, jenis_kelamin=?, umur=?, asal=?, tgl_masuk=?, nama_kandang=? where id_hewan=?";
    final String delete = "DELETE FROM tbl_hewan WHERE id_hewan = ?;";
    final String insertHistory = "INSERT INTO tbl_histori (nama_hewan, tgl_masuk, tgl_keluar) VALUES (?, ?, ?);";



    public ModelHewan() {
        connection = Connector.getConnection();
    }

    @Override
    public void insert(DataHewan h) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(insert, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, h.getNama());
            statement.setString(2, h.getJ_kelamin());
            statement.setDouble(3, h.getUmur());
            statement.setString(4, h.getAsal());
            statement.setString(5, h.getTanggalMasuk());
            statement.setString(6, h.getNama_kandang());
            
            statement.executeUpdate();
            ResultSet rs = statement.getGeneratedKeys();
            
            while(rs.next()){
                h.setId(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Successfully added data!");

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Failed to add data!");

        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public void update(DataHewan h) {
PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(update);
            statement.setString(1, h.getNama());
            statement.setString(2, h.getJ_kelamin());
            statement.setDouble(3, h.getUmur());
            statement.setString(4, h.getAsal());
            statement.setString(5, h.getTanggalMasuk());
            statement.setString(6, h.getNama_kandang());
            statement.setInt(7, h.getId());
            
            statement.executeUpdate();       
            JOptionPane.showMessageDialog(null, "Data updated successfully!");
        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data failed to update!");
        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
}

    @Override
    public void delete(int id) {
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(delete);
            
            statement.setInt(1, id);
            statement.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data deleted successfully!");

        }catch(SQLException ex){
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Data failed to delete!");

        }finally{
            try{
                statement.close();
            }catch(SQLException ex){
                ex.printStackTrace();
            }
        }
    }

    @Override
    public List<DataHewan> getAll() {
        List<DataHewan> dh = null;
        try{
            dh = new ArrayList<DataHewan>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                DataHewan hewan = new DataHewan();
                hewan.setId(rs.getInt("id_hewan"));
                hewan.setNama(rs.getString("nama_hewan"));
                hewan.setJ_kelamin(rs.getString("jenis_kelamin"));
                hewan.setUmur(rs.getInt("umur"));
                hewan.setAsal(rs.getString("asal"));
                hewan.setTanggalMasuk(rs.getString("tgl_masuk"));
                hewan.setNama_kandang(rs.getString("nama_kandang"));
                dh.add(hewan);
            }
            
            
        }catch(SQLException ex){
            Logger.getLogger(ModelHewan.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dh;
    }
    public void insertHistori(DataHewan h) {
        PreparedStatement statement = null;
        try {
            // Masukkan data ke tabel history terlebih dahulu
                statement = connection.prepareStatement(insertHistory, Statement.RETURN_GENERATED_KEYS);
                statement.setString(1, h.getNama());
                statement.setString(2, h.getTanggalMasuk());
                statement.setDate(3, new java.sql.Date(System.currentTimeMillis())); // tanggal keluar
                statement.executeUpdate();
                
                ResultSet rs = statement.getGeneratedKeys();
                while(rs.next()){
//                h.get(rs.getString(1));
                }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        } finally {
            try {
                statement.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }
}
