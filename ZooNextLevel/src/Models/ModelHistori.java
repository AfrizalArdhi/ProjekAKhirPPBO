/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Connector.Connector;
import DAOImplement.HistoriImplement;
import Data.DataHistori;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author afriz
 */
public class ModelHistori implements HistoriImplement {
    Connection connection;
    final String select = "SELECT * FROM tbl_histori";

    public ModelHistori() {
        connection = Connector.getConnection();
    }
    @Override
    public List<DataHistori> getAll() {
        List<DataHistori> dh = null;
        try{
            dh = new ArrayList<DataHistori>();
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(select);
            while(rs.next()){
                DataHistori histori = new DataHistori();
                histori.setId_histori(rs.getInt("id_histori"));
                histori.setNama_hewan(rs.getString("nama_hewan"));
                histori.setTgl_masuk(rs.getString("tgl_masuk"));
                histori.setTgl_keluar(rs.getString("tgl_keluar"));
                dh.add(histori);
            }
        }catch(SQLException ex){
            Logger.getLogger(ModelHistori.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dh;
    }
    
}
