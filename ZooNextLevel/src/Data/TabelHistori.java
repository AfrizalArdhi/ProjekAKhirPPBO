/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TabelHistori extends AbstractTableModel{
    List<DataHistori> list;
    public TabelHistori(List<DataHistori> list) {
        this.list = list;
    }

    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "ID ";
            case 1:
                return "Nama Hewan";
            case 2:
                return "Tanggal Masuk";
            case 3: 
                return "Tanggal Keluar";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list.get(row).getId_histori();
            case 1:
                return list.get(row).getNama_hewan();
            case 2:
                return list.get(row).getTgl_masuk();
            case 3:
                return list.get(row).getTgl_keluar();
            default:
                return null;
        }
    }
}
