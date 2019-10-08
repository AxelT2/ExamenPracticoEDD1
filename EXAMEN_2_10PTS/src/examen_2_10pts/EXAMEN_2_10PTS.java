/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_2_10pts;

import java.util.Scanner;

/**
 *
 * @author Les
 */
public class EXAMEN_2_10PTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arreglo1 = new int[10];
        int[] arreglo2 = new int[10];
        boolean a  = true;
        Scanner sCaptu = new Scanner(System.in);
        
        for(int i = 0; i< arreglo1.length; i++) {
        System.out.println("Introduce el valor " + (i+1));
        arreglo1[i]= sCaptu.nextInt();
        sCaptu.nextLine();
        }
        
            for (int i = 0; i< arreglo2.length; i++) {
            System.out.println("Introduce el valor " + (i+1) );
            arreglo2[i] = sCaptu.nextInt();
            sCaptu.nextLine();
            }
            
            
            System.out.print("Arreglo 1: ");
                for (int j = 0; j < arreglo1.length; j++) {
                    System.out.print("[" + arreglo1[j]+ "]");
                }
                System.out.println("");
                
                    System.out.print("Arreglo 2: ");
                    for (int k = 0; k < arreglo2.length; k++) {
                    System.out.print("[" + arreglo2[k]+ "]");
                    }
                    System.out.println("");
        
        for (int i = 0; i < arreglo1.length; i++) {
                if(arreglo1[i]!=arreglo2[i]) {  
                a = false;
                }
            }
            if( a == true) {
                System.out.println("Tus arreglos son iguales");    
            } else {
                System.out.println("Tus arreglos no son iguales");
            }

    
            
        
}
    
      
    
}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        /**  ARR[] arreglo1 = new ARR [10];
         ARR[] arreglo2 = new ARR [10]; 
           Scanner sCaptu = new Scanner(System.in);
           for (int i = 0; i <arreglo1.length; i++) { 
             System.out.println("Teclea 10 valores");
              arreglo1[i].arre1 = sCaptu.nextInt();
               
              for (int j = 0; j <arreglo2.length; j++) {
                   System.out.println("Teclea 10 valores");
                  arreglo2[j].arre2 = sCaptu.nextInt();
               }
               
      
        }
                
          
    }
    public static void imprimeArreglos(ARR[]args){
            for (int i = 0; i <args.length; i++) { 
                 System.out.println("Arreglo 1: [ " + args[i].arre1 + "]");
}
            for (int j = 0; j < args.length; j++) {
                System.out.println("Arreglo 2: ["+ args[j].arre2 + "]" );
            
        }
    
    }
    public class ARR{
    int arre1;
    int arre2;
}*/
