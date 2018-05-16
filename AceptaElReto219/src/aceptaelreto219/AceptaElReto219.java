/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aceptaelreto219;

import java.util.Scanner;

/**
 *
 * @author Usuario 1 DAM
 */
public class AceptaElReto219 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int contador1=0;
        Scanner sc = new Scanner(System.in);
        int contador = sc.nextInt();
        for (contador = contador; contador > 0; contador--) {
            int numeroboletos = sc.nextInt();
            
            for (int i = 0; i < numeroboletos; i++) {
                int numero = sc.nextInt();
                if (numero % 2 == 0) {
                    contador1=++contador1;
                } 
            }
                  System.out.println(contador1);
        contador1=0;
        }
              
    }


}