/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author F1401106
 */
public class Menu {
    public static void loadMenu() throws IOException{
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        menuInicial();
        System.out.println("deseja criar um arquivo de palavras novo ou usar um já existente ?\n\n 1 - Novo      2 - Usar Existente");
        byte resp = s.nextByte();
        if(resp==1){
            menuInicial();
            System.out.println("Qual o nome do arquivo ?");
            String arquivo = s1.nextLine();
          Palavras.createFile(arquivo);
        }else if(resp == 2) {
            int count=1;
            File[] arquivos = Palavras.listFiles();
            menuInicial();
            System.out.println("Escolha o arquivo");
            for(File arquivo : arquivos){
                System.out.println(count+" - "+arquivo.getName());
                count++;
            }
            
        }
    }
    private static void breakLine(int lines){
        for(int i = 0;i<lines;i++) System.out.print("\n");
    }
    private static void menuInicial(){
        for(int i =0;i<40;i++) System.out.print("#");
        System.out.println("\nBem-vindo ao jogo da forca do allah");
        breakLine(3);
    }
    private static void menuPopulaDoc(){
        
    }
}
