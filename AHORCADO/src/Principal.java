
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author baton
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner spider = new Scanner(System.in);
        boolean check = false, resu = false;
        char letri;
        char perro;
        int letras = 0;
        int intentar = 4;
        String selasabe = null;
        
        
        String[] palas = new String[]{"perro", "hospital", "trabajo", "amigo", "excusa", "espadachin", "cochipuerco"};
        String adivino = palas[(int)(Math.random()*palas.length)];
        char[] Palabra = adivino.toCharArray();
        char[] Cuau = new char [adivino.length()];
         int largo = (int)(adivino.length());
         
        for (int i = 0; i < adivino.length(); i++) {
            Cuau[i] = '_';
        }
        
         System.out.println("Bienvenido");
         
         while(intentar > 0 && !resu){
            
        System.out.println("Te quedan "+ intentar + " intentos");
        System.out.println(adivino);
        
        
        for (int i = 0; i < adivino.length(); i++) {
            System.out.print("["+Cuau[i]+"]");
        }
        System.out.println("\nSe sabe la palabra? (1 para si, 0 para no)");
        perro = spider.next().charAt(0);
        if(perro == '1'){
            System.out.println("Cuál es?");
            selasabe = spider.nextLine();
            if(selasabe.equals(adivino)){
                System.out.println("Asi es! ");
                break;
            }if(!selasabe.equals(adivino)){
                System.out.println("Eso no es");
                selasabe = null;
            }
            
        }
        
        if (perro == '0'){
        
        System.out.println("\nPonga una letra ");
        
        letri = spider.next().charAt(0);
            check = false;
            
            
                for (int i = 0; i < adivino.length(); i++) {
                 if(letri == adivino.charAt(i)){
                     Cuau[i] = adivino.charAt(i);
                     check = true;
                 }
                 
             }
                if(!check){
                    intentar--;
                }
                    for (int i = 0; i < adivino.length(); i++) {
                        if('_' == Cuau[i]){
                            letras++;
                        }
                    }
       }}
         if(letras > 0){
                    resu = false;
                }
                else{
                    resu = true;
                }
         for (int i = 0; i < adivino.length(); i++) {
            System.out.print("["+Cuau[i]+"]");
        }
         
                       if(resu = true){
                System.out.println("Perdiste");
            }
            else{
                System.out.println("Ganaste");
            }
    }
}
    
    

    
    

