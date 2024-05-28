/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAOImplement;
import Data.DataHewan;
import java.util.List;

public interface HewanImplement {
    public void insert(DataHewan h);
    public void update(DataHewan h);
    public void delete(int id);
    public void insertHistori(DataHewan h);
    public List<DataHewan> getAll();
}

