/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplomatriz;

import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class MetodoMatriz {
    
    int [][] notas = new int[3][4];
    
    public void cargarMatriz(){
        
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                notas [f][c] =pedirNota();
            }
    }
        
        }
    public int pedirNota(){
        int resultado;
        
        do{
            
            resultado= Integer.parseInt(JOptionPane.showInputDialog("Introduza o resultado"));
        }while(resultado<1||resultado>10);
        return resultado;
        
    }
    public void amosarMatriz(){
        
        for(int f=0;f<notas.length;f++){
            for(int c=0;c<notas[f].length;c++){
                System.out.print(notas[f][c]+" ");
        }
        System.out.println("\n");
    }
    }
    
    public void calcularMedia(){
        int media =0;
        for(int f=0;f<notas.length;f++){
            media=0;
            for(int c=0;c<notas.length;c++){
              media= media +notas[f][c];
                 
            } 
           
            System.out.println(media/notas.length);
        }
       // System.out.println("\n");
    }
}
