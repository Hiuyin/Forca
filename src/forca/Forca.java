/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forca;

//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//import java.nio.file.Files;
//import java.nio.file.Paths;

public class Forca {
int erros=0;
    public static void main(String[] args) throws IOException {
        File teste = new File(System.getProperty("user.dir")+File.separator+"Repo"+File.separator+"words.txt");
        BufferedWriter escrita = new BufferedWriter(new FileWriter(teste));
        escrita.append("\nteste4");
        escrita.newLine();
        escrita.close();
    //Menu.loadMenu();
    }
}
