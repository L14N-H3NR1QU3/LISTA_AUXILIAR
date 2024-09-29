/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_7;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_AUX_LIAN_7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = 0;
        int mai = 0;
        int min = 0;
        int som = 0;
        int qtd = 0;
        float med;
        do{
            System.out.println("Digite um valor: (valores 0 ou menor para sair)");
            String n = sc.next();
            try{
                num = Integer.parseInt(n);
                if(num > 0){
                    som += num;
                    qtd++;
                    if(min == 0){
                        min = num;
                    }
                    else if (min > num){
                        min = num;
                    }
                    if(mai < num){
                        mai = num;
                    }
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: valor invalido. \n");
            }
        }while(num > 0);
        med = som/qtd;
        System.out.println("Maior numero: "+mai);
        System.out.println("Menor numero: "+min);
        System.out.println("Qauntidade de numeros: "+qtd);
        System.out.println("Soma dos numeros: "+som);
        System.out.println("Media dos numeros: "+med);
    }
}
