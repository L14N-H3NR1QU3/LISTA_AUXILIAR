/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_4;
import java.util.Scanner;
/**
 *
 * @author farne
 */
public class LISTA_AUX_LIAN_4 {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       double lad1 = 0; 
       double lad2 = 0; 
       double lad3 = 0;
       String res;
       System.out.println("Informe o valor do primeiro lado:");
       res = sc.next();
       try{
           lad1 = Double.parseDouble(res);
       }
       catch(NumberFormatException e){
           System.out.println("ERRO: Valor invalido.");
       }
       System.out.println("Informe o valor do segundo lado:");
       res = sc.next();
       try{
           lad2 = Double.parseDouble(res);
       }
       catch(NumberFormatException e){
           System.out.println("ERRO: Valor invalido.");
       }
       System.out.println("Informe o valor do terceiro lado:");
       res = sc.next();
       try{
           lad3 = Double.parseDouble(res);
       }
       catch(NumberFormatException e){
           System.out.println("ERRO: Valor invalido.");
       }
       if((lad1 == lad2)&&(lad2 == lad3)&& (lad1 == lad3)){
        System.out.println("E um triangulo equilatero");
       }
       else if((lad1 == lad2)||(lad2 == lad3)||(lad1 == lad3)){
        System.out.println("E um Triangulo isosceles");
       }
       else if((lad1 != lad2)&&(lad2 != lad3)&&(lad1 != lad3)){
        System.out.println("E um Triangulo escaleneo");
       }
    }
}