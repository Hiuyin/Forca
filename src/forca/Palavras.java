/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author F1401106
 */
public class Palavras {
    static String nomeArquivo;
    public static void checkFile(){
     File test = new File("/wordsGame.txt");
     if(!test.exists()){
         
     };
    }
    public static void createFile(String arquivo) throws IOException{
        String path = System.getProperty("user.dir")+File.separator+"Repo"+File.separator+arquivo+".txt";
        File file = new File(path);
        if(file.createNewFile()){
            System.out.println(file.getName()+" Criado");
            nomeArquivo = file.getName();
            addWord(path);
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
    public static String[]  loadFile(String path) throws FileNotFoundException{
        ArrayList<String> palavras = new ArrayList<String>();
        File arquivo = new File(path);
        Scanner ler = new Scanner(arquivo);
        while(ler.hasNext()){
            palavras.add(ler.next());
        }
        String[] palavrasArray = palavras.toArray(new String[0]);
        return palavrasArray;
    }
    private static void addWord(String path) throws IOException{
        File dir = new File(path);
        Scanner s = new Scanner(System.in);
        System.out.println("Digite a palavra.");
        String word = s.nextLine();
        String resp = "";
        boolean respondido = false;
        PrintWriter out = new PrintWriter(new FileWriter(dir,true));
        out.println(word);
        out.close();
        while(!respondido){
        System.out.println("Deseja adicionar outra palavra ? \n Sim \n Não");
        resp = s.nextLine();
        switch(resp){
            case "sim":
                respondido = true;
                addWord(path);
                break;
            case "nao":
                respondido = true;
                //TODO Inicio de jogo;
                chooseWord(loadFile(path));
                break;
            default:
                System.err.println("Digite sim para Sim e nao para Não");
        }
        }
        
    }
    public static void chooseWord(String[] palavras){
        int tamanho = palavras.length;
        int escolha = (int) (Math.random()*tamanho);
        if(escolha>tamanho) escolha--;
        String palavra = palavras[escolha];
        Tabuleiro.paintTab(palavra);
        }
   // PrintWriter out = new PrintWriter("teste.txt");
}
