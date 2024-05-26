/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo.View;

import tubespbo.Status;

/**
 *
 * @author fauzan
 */
public class Pembayaran {
    private String idPembayaran;
    private String metodePembayaran;

    public Pembayaran(String idPembayaran, String metodePembayaran) {
        this.idPembayaran = idPembayaran;
        this.metodePembayaran = metodePembayaran;
    }

    public String getidPembayaran() {
        return idPembayaran;
    }

    public String getMetodePembayaran() {
        return metodePembayaran;
    }

    public Status status() {
        return null;
    }
}
