/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_7_20pts;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class EXAMEN_7_20PTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo = new int[15];
        int valor1; 
        int valor2;
        Scanner sCaptu = new Scanner(System.in);
        
        for (int i = 0; i<arreglo.length; i++) {
          arreglo[i]= (int)(Math.random()*20)+1;
            System.out.print(arreglo[i]);
        }
        
       System.out.println("¿Donde quieres que empiece?");
        valor1= sCaptu.nextInt(); 
        sCaptu.nextLine();
            System.out.println("¿Donde quieres que termine?");
        valor2 = sCaptu.nextInt(); 
        sCaptu.nextLine();
        
       System.out.println("Tus nimeros pares en el arreglo son: ");
        if(valor1 > valor2)
            imprimirArreglo(arreglo, valor1, valor2);
        else
            imprimirArreglo(arreglo, valor1, valor2);
        imprimirArreglo(arreglo);
    }
    
    public static void imprimirArreglo(int[] arreglo){
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("["+arreglo[i]+"]");
        }
        System.out.println("");
    }
    public static void imprimirArreglo(int[] arreglo, int valor1, int valor2){
         for (int i = valor1-1; i <= valor2-1; i++) {
            int resultado = arreglo[i]%2;
            if(resultado == 0){
                System.out.print("["+arreglo[i]+"]");               
            }
                
        }
    }
    
}
