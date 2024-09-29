/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_6;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_AUX_LIAN_6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = 0;
        do{
            System.out.println("Digite um numero: (0 = Sair)");
            String n = sc.next();
            try{
                num = Integer.parseInt(n);
                if(num%2 == 0){
                    System.out.println("Numero digitado e par. \n");
                }
                else{
                    System.out.println("Numero digitado e impar. \n");
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: Valor invalido. \n");
            }
        }while(num != 0);
    }
}
