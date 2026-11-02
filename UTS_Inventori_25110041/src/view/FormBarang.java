/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import model.Barang;
import dao.BarangDAO;

public class FormBarang extends javax.swing.JFrame {

    public FormBarang() {
        initComponents();
        loadData();
    }

    public void loadData() {

        javax.swing.table.DefaultTableModel model =
                (javax.swing.table.DefaultTableModel) tblBarang.getModel();

        model.setRowCount(0);

        BarangDAO dao = new BarangDAO();

        try {

            java.sql.ResultSet rs = dao.tampilData();

            while (rs.next()) {

                Object[] row = {
                    rs.getString("kode_barang"),
                    rs.getString("nama_barang"),
                    rs.getString("stok"),
                    rs.getString("kategori")
                };

                model.addRow(row);
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Kode_Barang = new javax.swing.JLabel();
        Nama_Barang = new javax.swing.JLabel();
        Stok = new javax.swing.JLabel();
        Kategori = new javax.swing.JLabel();
        txtKode = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtStok = new javax.swing.JTextField();
        cmbKategori = new javax.swing.JComboBox<>();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnBersih = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBarang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Kode_Barang.setText("Kode_Barang");

        Nama_Barang.setText("Nama_Barang");

        Stok.setText("Stok");

        Kategori.setText("Kategori");

        txtKode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKodeActionPerformed(evt);
            }
        });

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        cmbKategori.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Komputer", "Jaringan", "Alat ukur" }));

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnBersih.setText("Bersihkan");

        tblBarang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Kode barang", "Nama barang", "Stok", "Kategori"
            }
        ));
        tblBarang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBarangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBarang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Kode_Barang)
                            .addComponent(Nama_Barang)
                            .addComponent(Stok)
                            .addComponent(Kategori))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtKode)
                                    .addComponent(txtNama)
                                    .addComponent(txtStok, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnSimpan)
                        .addGap(38, 38, 38)
                        .addComponent(btnUbah)
                        .addGap(40, 40, 40)
                        .addComponent(btnHapus)
                        .addGap(57, 57, 57)
                        .addComponent(btnBersih))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 576, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kode_Barang)
                    .addComponent(txtKode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Nama_Barang)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Stok)
                    .addComponent(txtStok, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Kategori)
                    .addComponent(cmbKategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnUbah)
                    .addComponent(btnHapus)
                    .addComponent(btnBersih))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed

  

    if(txtKode.getText().isEmpty()){
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Kode barang tidak boleh kosong!");
        return;
    }

    if(txtNama.getText().isEmpty()){
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Nama barang tidak boleh kosong!");
        return;
    }

    if(txtStok.getText().isEmpty()){
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Stok tidak boleh kosong!");
        return;
    }

    try{
        int stok = Integer.parseInt(txtStok.getText());

        if(stok <= 0){
            javax.swing.JOptionPane.showMessageDialog(
                    this,
                    "Stok harus lebih dari 0!");
            return;
        }

    }catch(NumberFormatException e){
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Stok harus berupa angka!");
        return;
    }

    Barang b = new Barang();

    b.setKodeBarang(txtKode.getText());
    b.setNamaBarang(txtNama.getText());
    b.setKategori(cmbKategori.getSelectedItem().toString());
    b.setStok(Integer.parseInt(txtStok.getText()));

    BarangDAO dao = new BarangDAO();

    if (dao.simpan(b)) {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Data berhasil disimpan");
        loadData();
    } else {
        javax.swing.JOptionPane.showMessageDialog(
                this,
                "Data gagal disimpan");
    }

    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtKodeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKodeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKodeActionPerformed

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNamaActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
   Barang b = new Barang();

b.setKodeBarang(txtKode.getText());
b.setNamaBarang(txtNama.getText());
b.setKategori(cmbKategori.getSelectedItem().toString());
b.setStok(Integer.parseInt(txtStok.getText()));

BarangDAO dao = new BarangDAO();

if (dao.ubah(b)) {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Data berhasil diubah");

    loadData();

} else {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Data gagal diubah");
}
    }//GEN-LAST:event_btnUbahActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     String kode = txtKode.getText();

BarangDAO dao = new BarangDAO();

if (dao.hapus(kode)) {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Data berhasil dihapus");

    loadData();

    txtKode.setText("");
    txtNama.setText("");
    txtStok.setText("");

} else {

    javax.swing.JOptionPane.showMessageDialog(
            this,
            "Data gagal dihapus");
}
    }//GEN-LAST:event_btnHapusActionPerformed

    private void tblBarangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBarangMouseClicked
  int baris = tblBarang.getSelectedRow();

    txtKode.setText(tblBarang.getValueAt(baris, 0).toString());
    txtNama.setText(tblBarang.getValueAt(baris, 1).toString());
    txtStok.setText(tblBarang.getValueAt(baris, 2).toString());
    cmbKategori.setSelectedItem(tblBarang.getValueAt(baris, 3).toString());
    }//GEN-LAST:event_tblBarangMouseClicked

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
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormBarang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormBarang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Kategori;
    private javax.swing.JLabel Kode_Barang;
    private javax.swing.JLabel Nama_Barang;
    private javax.swing.JLabel Stok;
    private javax.swing.JButton btnBersih;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JComboBox<String> cmbKategori;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBarang;
    private javax.swing.JTextField txtKode;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtStok;
    // End of variables declaration//GEN-END:variables
}
