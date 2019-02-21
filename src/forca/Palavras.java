/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author F1401106
 */
public class Palavras {
    public static void checkFile(){
     File test = new File("/wordsGame.txt");
     if(!test.exists()){
         
     };
    }
    public static void createFile(String arquivo) throws IOException{
        String path = System.getProperty("user.dir")+File.separator+""+arquivo;
        File file = new File(path);
        if(file.createNewFile()){
            System.out.println(path+" Criado");
        } else {
            System.out.println("Arquivo já presente");
        }
    }
    public static File[] listFiles(){
        File diretorio = new File(System.getProperty("user.dir")+File.separator+"Repo");
        File[] arquivos = diretorio.listFiles(new FilenameFilter(){
            public boolean accept(File dir, String name){
                return name.endsWith(".txt");
            }
        });
        return arquivos;
    }
    private static String[]  loadFile(String path){
        String[] palavras = null;
        
    
        return palavras;
    }
   // PrintWriter out = new PrintWriter("teste.txt");
}
