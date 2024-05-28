/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author afriz
 */
public class TabelHewan extends AbstractTableModel{
    List<DataHewan> list;
    public TabelHewan(List<DataHewan> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID";
            case 1:
                return "Nama Hewan";
            case 2:
                return "Jenis Kelamin";
            case 3: 
                 return "Umur";
            case 4: 
                return "Asal";
            case 5: 
                return "Tanggal Masuk";
            case 6: 
                return "Jenis";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list.get(row).getId();
            case 1:
                return list.get(row).getNama();
            case 2:
                return list.get(row).getJ_kelamin();
            case 3:
                return list.get(row).getUmur();
            case 4:
                return list.get(row).getAsal();
            case 5: 
                return list.get(row).getTanggalMasuk();
            case 6:
                return list.get(row).getNama_kandang();                
            default:
                return null;
        }
    }
}
