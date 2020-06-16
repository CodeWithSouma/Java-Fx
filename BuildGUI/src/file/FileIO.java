/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;



/**
 *
 * @author souma
 */
public class FileIO {
    public static void main(String[] args) throws IOException {
      /*  File file=new File("text.txt");
        if(!file.exists()) file.createNewFile();
       FileWriter fileWriter=new FileWriter(file,true);
        fileWriter.write("hello souma ");
        fileWriter.close();
       
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }
        
       scanner.close();
        
        file.delete();
        */
       
      File file=new File("E:\\Java Swing Code\\BuildGUI\\file Date\\document.txt");
       if(!file.exists())file.createNewFile();
       
    }
}
