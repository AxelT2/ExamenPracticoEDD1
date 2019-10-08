/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_3_20pts;

/**
 *
 * @author Les
 */
public class EXAMEN_3_20PTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[15];
         for (int i = 0; i <arreglo.length; i++) {
            arreglo[i] = (int)(Math.random()*100)+1;
        }
         
        System.out.println("Arreglo:");
        
     imprimir(arreglo);
        int[] conteo = new int[100];
        for (int i = 0; i < arreglo.length; i++) {
            conteo[arreglo[i]-1] += 1;
        }
        int acum = 0;
        for (int i = 0; i < conteo.length; i++) {
            if(!(conteo[i] == 0))
                acum+=1;
        }
        int[][] matriz = new int[acum][2];
        
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < conteo.length; j++) {
                if(conteo[j] != 0){
                    matriz[i][0] = j+1;
                    matriz[i][1] = conteo[j];
                    conteo[j] = 0;
                    j = conteo.length;
            }
   }
        }
       for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("["+matriz[i][j]+"]");
            }
            System.out.println("");
        }
    } public static void imprimir(int[] arreg){
        for (int i = 0; i < arreg.length; i++) {
            System.out.print("["+arreg[i]+"]");
        }
        System.out.println("");
    }
    
}
