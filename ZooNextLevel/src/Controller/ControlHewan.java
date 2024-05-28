/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Data.*;
import DAOImplement.HewanImplement;
import Views.TransaksiPage;
import java.util.List;  
import Models.ModelHewan;
/**
 *
 * @author afriz
 */
public class ControlHewan {
    HewanImplement imphewan;
    TransaksiPage frame;
    List<DataHewan> dh;
   
    public ControlHewan(TransaksiPage frame){
        this.frame = frame;
        imphewan = new ModelHewan();
        dh = imphewan.getAll();
    }
    
    public void isiTabel(){
        dh = imphewan.getAll();
        TabelHewan th = new TabelHewan(dh);
        frame.getTabelHewan().setModel(th);
    }
    
    public void insert(){
        DataHewan dh = new DataHewan();
//        dh.setId(Integer.parseInt(frame.getJtxID().getText()));
        dh.setNama(frame.getJtxtNama().getText());
        dh.setJ_kelamin(frame.getJtxJK().getText());
        dh.setAsal(frame.getJtxAsal().getText());
        dh.setUmur(Integer.parseInt(frame.getJtxUmur().getText()));
        dh.setTanggalMasuk(frame.getJtxTanggal().getText());
        dh.setNama_kandang(frame.getCoba());
        imphewan.insert(dh);
    }
    
    public void update(){
        DataHewan dh = new DataHewan();
        dh.setNama(frame.getJtxtNama().getText());
        dh.setJ_kelamin(frame.getJtxJK().getText());
        dh.setAsal(frame.getJtxAsal().getText());
        dh.setUmur(Integer.parseInt(frame.getJtxUmur().getText()));
        dh.setTanggalMasuk(frame.getJtxTanggal().getText());
        dh.setNama_kandang(frame.getCoba());
        imphewan.update(dh);
    }
    
    public void delete(){
        
        int dump = Integer.parseInt(frame.getJtxID().getText());
        imphewan.delete(dump);
    }
    
    public void cobainsert(){
        DataHewan dh = new DataHewan();
        dh.setNama(frame.getJtxtNama().getText());
        dh.setJ_kelamin(frame.getJtxJK().getText());
        dh.setTanggalMasuk(frame.getJtxTanggal().getText());
        imphewan.insertHistori(dh);
    }
}
