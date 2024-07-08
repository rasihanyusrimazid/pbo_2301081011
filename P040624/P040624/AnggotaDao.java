/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P040624.P040624;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author acer
 */
public class AnggotaDao {
    private List<Anggota> data =new ArrayList();
    
    public AnggotaDao(){
        data.add(new Anggota("A001","Ali","Padang","L"));
         data.add(new Anggota("A002","Ani","Padang","P"));
    }
    public void insert(Anggota anggota){
        data.add(anggota);
    }
    public void update(int index,Anggota anggota){
        data.set(index,anggota);
    }
    public void delate(int index){
        data.remove(index);
    }
    public Anggota getAnggota(int index){
        return data.get(index);
    }
    public List<Anggota>getAll(){
        return data;
    }
}
