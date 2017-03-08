/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//Kevin Gerardo Hinojosa Castellanos   A01411383    IMT
package spp.khinojosac.a09;
import java.util.Scanner;
/**
 *
 * @author kevinhinojosa
 */
public class SPPKHinojosaCA09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int matriza[][] = new int [3][3];
         int matrizb[][] = new int [3][3];
         int matrizresultante[][] = new int [3][3];
         int i, j;
         
         Scanner teclado = new Scanner (System.in);
         
         System.out.println("Datos de la Matriz A :");
         
         for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matriza [i][j]= teclado.nextInt();
                }
            }
            
            System.out.println("Datos de la Matriz B :");
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 System.out.print("Escribir valor " + i + " , " + j + " : ");
                 matrizb [i][j]= teclado.nextInt();
                }
            }
            
            for (i=0; i<=2; i++){
             for (j=0; j<=2; j++){
                 matrizresultante [i][j]= matriza[i][j]+matrizb[i][j];
                }
            }
            
            System.out.println("Matriz resultante de la suma :");
    for (i=0;i<=2;i++){
            for (j=0;j<=2;j++) {
                System.out.print(matrizresultante[i][j] + " ");
            }
            System.out.println("");
            
        }
     
    /**
     *
     * @param matriza
     * @param matrizb
     * @return
     */
   
        
    }


}  
