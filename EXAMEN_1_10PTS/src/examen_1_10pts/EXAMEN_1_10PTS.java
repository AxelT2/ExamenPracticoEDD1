/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_1_10pts;


/**
 *
 * @author Les
 */
public class EXAMEN_1_10PTS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
     int pares[] = new int [15]; 
        for (int i = 1; i<pares.length; i++) {
           pares[i] =(int)(Math.random()*50)+1;
           pares[i] = pares[i]*2;
           for (int j = 0; j <i; j++) {
                if (pares[i] == pares[j]){
                    
                }
            
        }
        }
    
        for (int i = 0; i <pares.length; i++) {
              System.out.print("[" + pares[i] + "]"); 
                             
            }
           
        }
          
         }

      
   
    
