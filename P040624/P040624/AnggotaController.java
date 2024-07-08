/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package P040624.P040624;

import java.util.List;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

/**
 *
 * @author acer
 */
public class AnggotaController {
    
    private FormAnggota formAnggota;
    private Anggota anggota;
    private AnggotaDao anggotaDao;
    
    public AnggotaController(FormAnggota formAnggota){
        this.formAnggota =formAnggota;
        anggotaDao =new AnggotaDao();
        
    }
    public void clearForm(){
       formAnggota.getTxtKodeAnggota().setText(""); 
       formAnggota.getTxtNamaAnggota().setText("");
       formAnggota.getTxtAlamat().setText("");
       formAnggota.getCboJenisKelamin().removeAllItems();
       formAnggota.getCboJenisKelamin().addItem("L");
       formAnggota.getCboJenisKelamin().addItem("p");
       
       
       
    }
    
    public void tampil(){
        DefaultTableModel tabelModel = (DefaultTableModel)
                formAnggota.getTblAnggota().getModel();
        tabelModel.setRowCount(0);
        List<Anggota> list = anggotaDao.getAll();
        for (Anggota a : list){
            Object[] row = {
                a.getKodeAnggota(),
                a.getNamaAnggota(),
                a.getAlamat(),
                a.getJenisKelamin()
            };
            tabelModel.addRow(row);
        }
    }
    
    public void saveAnggota(){
        anggota=new Anggota();
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.insert(anggota);
        JOptionPane.showMessageDialog(formAnggota,"Insert OK");
    }
    public void updateAnggota(){
        int index = formAnggota.getTblAnggota().getSelectedRow();
        anggota = anggotaDao.getAnggota(index);
        anggota.setKodeAnggota(formAnggota.getTxtKodeAnggota().getText());
        anggota.setNamaAnggota(formAnggota.getTxtNamaAnggota().getText());
        anggota.setAlamat(formAnggota.getTxtAlamat().getText());
        anggota.setJenisKelamin(formAnggota.getCboJenisKelamin().getSelectedItem().toString());
        anggotaDao.update(index, anggota);
        JOptionPane.showMessageDialog(formAnggota,"Update OK");
    }
    
    public void getAnggota(){
        int index=formAnggota.getTblAnggota().getSelectedRow();
        anggota=anggotaDao.getAnggota(index);
        if(anggota!=null){
            formAnggota.getTxtKodeAnggota().setText(anggota.getKodeAnggota());
            formAnggota.getTxtNamaAnggota().setText(anggota.getNamaAnggota());
            formAnggota.getTxtAlamat().setText(anggota.getAlamat());
            formAnggota.getCboJenisKelamin().setSelectedItem(anggota.getJenisKelamin());
        }
    }
    public void deleteAnggota(){
        int index =formAnggota.getTblAnggota().getSelectedRow();
        anggotaDao.delate(index);
        JOptionPane.showMessageDialog(formAnggota,"delete OK");
        
    }
}
