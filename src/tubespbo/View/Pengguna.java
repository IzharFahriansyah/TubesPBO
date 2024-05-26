    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.View;

/**
 *
 * @author fauzan
 */
public class Pengguna {
    private int idPengguna;
    private String nama;
    private String email;

    public Pengguna(int idPengguna, String nama, String email) {
        this.idPengguna = idPengguna;
        this.nama = nama;
        this.email = email;
    }

    public int getidPengguna() {
        return idPengguna;
    }

    public String getName() {
        return nama;
    }

    public String getEmail() {
        return email;
    }
}