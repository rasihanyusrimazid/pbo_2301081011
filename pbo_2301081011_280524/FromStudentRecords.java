/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package pbo_2301081011_280524;

/**
 *
 * @author ACER
 */
public class FromStudentRecords extends javax.swing.JFrame {

    /**
     * Creates new form FromStudentRecords
     */
    public FromStudentRecords() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        txtMathGrade = new javax.swing.JTextField();
        txtEnglishGrade = new javax.swing.JTextField();
        txtScieneGrade = new javax.swing.JTextField();
        txtAvarage = new javax.swing.JTextField();
        btnProses = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 20, 32, 16);

        jLabel2.setText("Address");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 50, 50, 16);

        jLabel3.setText("Age");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 80, 30, 16);

        jLabel4.setText("MathGrade");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 110, 60, 16);

        jLabel5.setText("EnglishGrade");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 69, 16);

        jLabel6.setText("ScieneGrade");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 170, 70, 16);

        jLabel7.setText("Average");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 250, 50, 16);
        getContentPane().add(txtName);
        txtName.setBounds(180, 20, 210, 22);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(180, 50, 210, 22);
        getContentPane().add(txtAge);
        txtAge.setBounds(180, 80, 210, 22);
        getContentPane().add(txtMathGrade);
        txtMathGrade.setBounds(180, 110, 210, 22);
        getContentPane().add(txtEnglishGrade);
        txtEnglishGrade.setBounds(180, 140, 210, 22);
        getContentPane().add(txtScieneGrade);
        txtScieneGrade.setBounds(180, 170, 210, 22);

        txtAvarage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAvarageActionPerformed(evt);
            }
        });
        getContentPane().add(txtAvarage);
        txtAvarage.setBounds(180, 250, 210, 22);

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });
        getContentPane().add(btnProses);
        btnProses.setBounds(20, 210, 370, 23);

        setSize(new java.awt.Dimension(424, 338));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtAvarageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAvarageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAvarageActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        // TODO add your handling code here:
        pbo_2301081011_260324.StudentRecord student = new pbo_2301081011_260324.StudentRecord();
        student.setName(txtName.getText());
        student.setAddress(txtAddress.getText());
        student.setAge(Integer.parseInt(txtAge.getText()));
        student.setMathGrade(Double.parseDouble(txtMathGrade.getText()));
        student.setEnglishGrade(Double.parseDouble(txtEnglishGrade.getText()));
        student.setScieneGrade(Double.parseDouble(txtScieneGrade.getText()));
        txtAvarage.setText(student.getAverage()+ "");
        
        
        
    }//GEN-LAST:event_btnProsesActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromStudentRecords.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromStudentRecords().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnProses;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtAvarage;
    private javax.swing.JTextField txtEnglishGrade;
    private javax.swing.JTextField txtMathGrade;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtScieneGrade;
    // End of variables declaration//GEN-END:variables
}
