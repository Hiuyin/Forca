/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

import java.util.Scanner;

/**
 *
 * @author F1401106
 */
public class Tabuleiro {
    static int errors=6;
    private static String[] loadTab(){
        String[] Forca = {" +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       "/|\\         |\n"
            +       "/\\          |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"," +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       "/|\\         |\n"
            +       "/           |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"," +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       "/|\\         |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|",
    " +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       "/|          |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"," +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       " |          |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"," +----------+\n"
            +       " |          |\n"
            +       " O          |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"," +----------+\n"
            +       " |          |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "            |\n"
            +       "____________|"};
    return Forca;
    }
    private static void paintUnderline(String word){
        for(int count = 0;count<word.length();count++){
            System.out.print("_ ");
        }
        checkWord(word);
    }
    public static void paintTab(String word){
       String[] board = loadTab();
        System.out.println(board[errors]);
        paintUnderline(word);
    }
    private static void checkWord(String word){
        Scanner s = new Scanner(System.in);
        char[] letras = word.toCharArray();
        char letra = ' ';
        System.out.println("Digite uma letra");
        letra = s.next().charAt(0);
        System.out.println(new String(letras).contains(Character.toString(letra)));
        System.out.println(new String(letras).indexOf(Character.toString(letra)));
    }
  
    
}
