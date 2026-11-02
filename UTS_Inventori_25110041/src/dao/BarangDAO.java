package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import model.Barang;

public class BarangDAO {

    // SIMPAN
    public boolean simpan(Barang b) {
        try {
            Connection c = koneksi.getConnection();

            String sql = "INSERT INTO barang VALUES(?,?,?,?)";

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, b.getKodeBarang());
            ps.setString(2, b.getNamaBarang());
            ps.setString(3, b.getKategori());
            ps.setInt(4, b.getStok());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // TAMPIL DATA
    public ResultSet tampilData() {
        try {
            Connection c = koneksi.getConnection();
            Statement st = c.createStatement();

            return st.executeQuery("SELECT * FROM barang");

        } catch (Exception e) {
            return null;
        }
    }

    // UBAH DATA
    public boolean ubah(Barang b) {
        try {
            Connection c = koneksi.getConnection();

            String sql = "UPDATE barang SET nama_barang=?, kategori=?, stok=? WHERE kode_barang=?";

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, b.getNamaBarang());
            ps.setString(2, b.getKategori());
            ps.setInt(3, b.getStok());
            ps.setString(4, b.getKodeBarang());

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }

    // HAPUS DATA
    public boolean hapus(String kode) {
        try {
            Connection c = koneksi.getConnection();

            String sql = "DELETE FROM barang WHERE kode_barang=?";

            PreparedStatement ps = c.prepareStatement(sql);

            ps.setString(1, kode);

            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            System.out.println(e);
            return false;
        }
    }
}