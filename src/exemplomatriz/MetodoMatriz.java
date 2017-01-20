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
    int filas = pedirTamaño();
    int columnas = pedirTamaño();
    int [][] notas = new int[filas][columnas];
    float [] notasMedias = new float[filas];
    float [] notasModulo = new float[columnas];
    
    public void cargarMatriz(){
        
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                notas [f][c] =pedirNota();
            }
    }
        
        }
    public int pedirNota(){
        int resultado;
        
        do{
            
            resultado= Integer.parseInt(JOptionPane.showInputDialog("Introduza as notas "));
        }while(resultado<1||resultado>10);
        return resultado;
        
    }
    public void amosarMatriz(){
        
        for(int f=0;f<filas;f++){
            for(int c=0;c<columnas;c++){
                System.out.print(notas[f][c]+" ");
        }
        System.out.println("\n");
    }
    }
    
    public void calcularMedia(){
        int media =0;
        for(int f=0;f<filas;f++){
            
            media=0;
            for(int c=0;c<columnas;c++){
              media= media +notas[f][c];
                 
            } 
           
            notasMedias[f] = media/filas;
        }
    }
     public void calcularModulo(){
         int acu =0;
        
         for(int c=0;c<columnas;c++){
           acu=0;
             
             for(int f=0;f<filas;f++){
                 
                 acu= acu+notas[f][c];
                 
             }    
                 
                 notasModulo [c] = acu/filas;
           
             System.out.println(notasModulo[c]);
         
     }
    }
public int pedirTamaño(){
    
    return  Integer.parseInt(JOptionPane.showInputDialog("Tamaño"));

}
}