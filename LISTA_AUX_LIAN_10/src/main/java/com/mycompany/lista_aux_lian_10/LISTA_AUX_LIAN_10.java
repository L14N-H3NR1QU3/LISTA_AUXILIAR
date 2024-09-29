/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_10;

/**
 *
 * @author Ryzen
 */
import java.util.Scanner;
public class LISTA_AUX_LIAN_10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = 0;
        do{
            System.out.println("Digite valor entre 0 e 50: ");
            String n = sc.next();
            try{
                num = Integer.parseInt(n);
                if(num < 0 || num > 50){
                    System.out.println("ERRO: valor invalido.");
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: Valor invalido.");
            }
        }while(num < 0 || num > 50);
        int numeros[] = new int [num];
        int pos[] = new int [num];
        int neg[] = new int [num];
        int qtdPos = 0;
        int qtdNeg = 0;
        for(int i = 0; i < num; i ++){
            System.out.println("Digite um numero: ");
            String n = sc.next();
            try{
                numeros[i] = Integer.parseInt(n);
                if(numeros[i] >= 0){
                    pos[i] = numeros[i];
                    qtdPos++;
                }
                else{
                    neg[i] = numeros[i];
                    qtdNeg++;
                }
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: Valor invalido.");
            }
        }
        for(int i = 0; i < qtdPos; i++){
            System.out.println("Numeros positivos "+pos[i]);
        }
        for(int i = 0; i < qtdNeg; i++){
            if(neg[i] < 0){
                System.out.println("Numeros negativos "+neg[i]);
            }
        }
        System.out.println("Quantidade de numeros positivos: "+qtdPos);
        System.out.println("Quantidade de numeros negativos: "+qtdNeg);
    }
}
