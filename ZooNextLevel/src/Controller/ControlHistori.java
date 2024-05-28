/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import DAOImplement.HistoriImplement;
import Data.DataHistori;
import Data.TabelHistori;
import Models.ModelHistori;
import Views.HistoriPage;
import java.util.List;

/**
 *
 * @author afriz
 */
public class ControlHistori {
    HistoriImplement imphistori;
    HistoriPage frame;
    List<DataHistori> dh;

    public ControlHistori(HistoriPage frame) {
        this.frame = frame;
        imphistori = new ModelHistori();
        dh = imphistori.getAll();
    }
    
    public void isiTabel(){
        dh = imphistori.getAll();
        TabelHistori th = new TabelHistori(dh);
        frame.getTabelHistori().setModel(th);
    }
    
}
