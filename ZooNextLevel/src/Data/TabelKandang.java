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
public class TabelKandang extends AbstractTableModel{
    List<DataHewan> list;
    public TabelKandang (List<DataHewan> list){
        this.list = list;
    }
    
    @Override
    public int getRowCount() {
        return list.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Nama Hewan";
            case 1:
                return "Jenis Kelamin";
            case 2:
                return "Umur";
            case 3: 
                return "Asal";
            case 4: 
                return "Tanggal Masuk";
            default:
                return null;
        }
    }

    @Override
    public Object getValueAt(int row, int column) {
        switch (column) {
            case 0:
                return list.get(row).getNama();
            case 1:
                return list.get(row).getJ_kelamin();
            case 2:
                return list.get(row).getUmur();
            case 3:
                return list.get(row).getAsal();
            case 4:
                return list.get(row).getTanggalMasuk();
            default:
                return null;
        }
    }
}
