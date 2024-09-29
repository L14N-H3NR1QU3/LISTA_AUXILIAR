/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_2;

import java.util.Scanner;

/**
 *
 * @author l.silva
 */
public class LISTA_AUX_LIAN_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num1 = 0;
        int num2 = 0;
        do{
            System.out.println("Digite um numero: ");
            num1 = sc.nextInt();
            if(num1 < 0){
                System.out.println("ERRO: numero apenas positivos");
            }
        }while(num1 < 0);
        do{
            System.out.println("Digite um numero: ");
            num2 = sc.nextInt();
            if(num2 < 0){
                System.out.println("ERRO: numero apenas positivos");
            }
        }while(num2 < 0);
        System.out.println("Soma de "+num1+" com "+num2+" = "+(num1+num2));
    }
}
