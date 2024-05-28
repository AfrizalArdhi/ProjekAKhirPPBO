/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;
import Connector.Connector;
import DAOImplement.DataImplement;
import Data.DataHewan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author afriz
 */
public class ModelData implements DataImplement {
    Connection connection;
    final String select = "SELECT * FROM tbl_hewan where nama_kandang = ?";
    
    public ModelData(){
        connection = Connector.getConnection();
    }
    @Override
    public List<DataHewan> getAll(String s){
        List<DataHewan> dd = new ArrayList<DataHewan>();
        PreparedStatement statement = null;
        try{
            statement = connection.prepareStatement(select);
            statement.setString(1, s);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                DataHewan h = new DataHewan();
                h.setId(rs.getInt("id_hewan"));
                h.setNama(rs.getString("nama_hewan"));
                h.setJ_kelamin(rs.getString("jenis_kelamin"));
                h.setUmur(rs.getInt("umur"));
                h.setAsal(rs.getString("asal"));
                h.setTanggalMasuk(rs.getString("tgl_masuk"));
                h.setNama_kandang(rs.getString("nama_kandang"));
                dd.add(h);
            }
        }catch(SQLException ex){
            Logger.getLogger(ModelData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return dd;
        
    }
}