/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2_20pts;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class EXAMEN_2_20PTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int arreglo[] = new int[15]; 
        Scanner sCapture= new Scanner(System.in);
        for (int i = 0; i <arreglo.length; i++) {
            arreglo[i] =(int)(Math.random()*100)+1;
        }
        
        int acum =0;
        imprimir(arreglo);
        System.out.print("Inserte un número:");
        int num = sCapture.nextInt();
        for (int i = 0; i <arreglo.length; i++) {
            if(arreglo[i] == num){
                acum += 1;
                for (int j = i; j < (arreglo.length-1); j++) {
                    arreglo[j] = arreglo[j+1];
                }
                for (int k = arreglo.length-acum; k < arreglo.length; k++) {
                        arreglo[k] = 0;
                    }
            }
        }
        imprimir(arreglo);
        
    }
    public static void imprimir(int[] arre){
        for (int i = 0; i < arre.length; i++) {
            System.out.print("["+arre[i]+"]");
        }
        System.out.println("");
    }
    
}
