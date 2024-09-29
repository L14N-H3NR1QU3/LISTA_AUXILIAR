/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lista_aux_lian_5;

/**
 *
 * @author Ryzen
 */
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class LISTA_AUX_LIAN_5 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner (System.in);
        boolean pass;
        float ps = 0;
        System.out.println("Digite seu nome:");
        String nome = sc.next();
        do{
            pass = true;
            System.out.println("Digite seu peso:");
            String peso = sc.next();
            try{
                ps = Float.parseFloat(peso);
            }
            catch(NumberFormatException e){
                System.out.println("ERRO: valor invalido");
                pass = false;
            }
        }while(!pass);
        FileWriter leitor = new FileWriter("C:/Users/Ryzen/Documents/NetBeansProjects/LISTA_AUX_LIAN_5/Lutaroes/"+nome+".txt");
        PrintWriter grava = new PrintWriter(leitor);
        grava.printf("Nome do lutador: "+nome+"\n");
        grava.printf("Peso do lutador: "+ps+"\n");
        if(ps < 65){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria pena\n");
        }
        else if(ps >= 65 && ps <72){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria leve\n");
        }
        else if(ps >= 72 && ps < 79){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria ligeiro\n");
        }
        else if(ps >= 79 && ps < 86){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria meio medio\n");
        }
        else if(ps >= 86 && ps < 93){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria medio\n");
        }
        else if(ps >= 93 && ps < 100){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria meio pesad\n");
        }
        else if(ps >= 100){
            grava.printf("O lutador "+nome+" pesa "+ps+" kg e se enquadra na categoria pesado\n");
        }
    }
}
