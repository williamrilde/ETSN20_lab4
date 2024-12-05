package Lab4.ETSN20_lab4;
import java.io.File;

import java.util.Scanner;





public class wordsearcher{

   public static void main(String [] args){
    Scanner inputScan = new Scanner(System.in);
    System.out.println("Write the name of the file ");
    String fileName = inputScan.nextLine();
    
    
    System.out.println("Write the word you're searching for");
    String word = inputScan.nextLine();
    
    
    try {
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        int lineNumber = 0;

        while (scan.hasNextLine()) {
            lineNumber++;
            String line = scan.nextLine();
            if(line.contains(word)){
                System.out.println("Row" + lineNumber + ": " + line+ " ");
            }
            
        }
        scan.close();
    } catch (Exception e) {
        throw new RuntimeException(e);
    }finally{
        inputScan.close();
    }
    }

   }

   

