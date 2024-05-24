/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

/**
 *
 * @author fauzan
 */
public class Donasi {
    
    private int idDonasi;
    private double JumlahDonasi;
    private String metodePembayaran;
    private int idPengguna;

    public Donasi(int idDonasi, double JumlahDonasi, String metodePembayaran, int idPengguna) {
        this.idDonasi = idDonasi;
        this.JumlahDonasi = JumlahDonasi;
        this.metodePembayaran = metodePembayaran;
        this.idPengguna = idPengguna;
    }

    public String getinfoDonasi() {
        return "Donasi ID: " + idDonasi + ", Jumlah Donasi: " + JumlahDonasi + ", Metode Pembayaran: " + metodePembayaran;
    }

    public void setinfoDonasi(String infoDonasi) {
   
    }
}
