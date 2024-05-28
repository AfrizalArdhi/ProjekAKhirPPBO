/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import DAOImplement.DataImplement;
import Data.DataHewan;
import Data.TabelKandang;
import Models.ModelData;
import Views.HomePage;
import java.util.List;
/**
 *
 * @author afriz
 */
public class ControlData {
    DataImplement imphewan;
    HomePage frame;
    List<DataHewan> dh;
    
    public ControlData(HomePage frame){
    this.frame = frame;
    imphewan = new ModelData();
    dh = imphewan.getAll(frame.getCoba());
    }

    public void isiTabel(String s) {
        dh = imphewan.getAll(s);
        TabelKandang tk = new TabelKandang(dh);
        frame.getTabelHewan().setModel(tk);
    }
}
