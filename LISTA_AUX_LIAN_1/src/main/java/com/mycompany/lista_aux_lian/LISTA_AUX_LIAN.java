/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian;

/**
 *
 * @author l.silva
 */
import java.util.Scanner;
public class LISTA_AUX_LIAN {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite um numero: ");
        int num1 = sc.nextInt();
        System.out.println("Digite um numero: ");
        int num2 = sc.nextInt();
        System.out.println("Soma de "+num1+" com "+num2+" = "+(num1+num2));
    }
}
