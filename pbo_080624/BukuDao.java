/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo_080624;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author acer
 */
public class BukuDao {
    private List<Buku> data = new ArrayList();
    
    public BukuDao(){
        data.add(new Buku("B001","Si Kancil","Yudhistira Ikranegara","Pustaka Agung Harapan",2010));
        data.add(new Buku("B002","Lutung Kasarung","Lilis Hu","Bhuana Ilmu Populer",2019));
    }
    public void insert(Buku buku){
        data.add(buku);
    }
    
    public void update(int index,Buku buku){
        data.set(index, buku);
    }
    
    public void delete(int index){
        data.remove(index);
    }
    
    public Buku getBuku(int index){
        return data.get(index);
    }
    
    public List<Buku> getAll(){
        return data;
    }
       
}
