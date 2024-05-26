/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubespbo;

import tubespbo.View.Registrasi;

/**
 *
 * @author fauzan
 */
public class TUBESPBO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Registrasi rg = new Registrasi();
        rg.setVisible(true);
        rg.pack();
        rg.setLocationRelativeTo(null);
        rg.setDefaultCloseOperation(Registrasi.EXIT_ON_CLOSE);
    }
    
}
