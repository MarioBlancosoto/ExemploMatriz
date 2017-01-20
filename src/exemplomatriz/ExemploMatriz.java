/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

/**
 *
 * @author Mario
 */
public class ExemploMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      MetodoMatriz obx = new MetodoMatriz();
      
      obx.cargarMatriz();
     
      obx.calcularModulo();
      obx.amosarMatriz();
    }
    
}
