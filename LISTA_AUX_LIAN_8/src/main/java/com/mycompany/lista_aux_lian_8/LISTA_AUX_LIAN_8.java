/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_8;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_AUX_LIAN_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        boolean pass;
        int min = 0;
        int max = 0;
        do{
            pass = true;
            System.out.println("Digite um valor minimo: ");
            String m = sc.next();
            System.out.println("Digite um valor maximo: ");
            String M = sc.next();
            try{
                min = Integer.parseInt(m);
                max = Integer.parseInt(M);
                if(min > max){
                    int aux = min;
                    min = max;
                    max = aux;
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: Valor invalido.");
                pass = false;
            }
        }while(!pass);
        int num = 0;
        int qtd = 0;
        int som = 0;
        do{
            System.out.println("Digite um valor: (digite 0 para sair)");
            String n = sc.next();
            try{
                num = Integer.parseInt(n);
                if(num <= max && num >= min){
                    som += num;
                    qtd++;
                }else if(num != 0){
                    System.out.println("Valor fora do intervalo ["+min+", "+max+"]");
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: valor invalido. \n");
            }
        }while(num != 0);
        System.out.println("Total dos numeros: "+som);
        System.out.println("quantidade dos numeros: "+qtd);
    }
}
