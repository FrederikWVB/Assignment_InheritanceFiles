package Files_StringReader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    public static void main(String[] args) {
        readFile();
    }

    public static void readFile(){
        try{
            File test = new File("resources/sample.txt");
            Scanner fileScanner = new Scanner(test);

            int wordCounter = 0;
            while (fileScanner.hasNext()){
                fileScanner.nextLine();
                wordCounter++;
            }

            System.out.println("Sample.txt has " + wordCounter + " words in it");
        }
        catch (FileNotFoundException e){
            System.out.println("Oops");
        }
    }
}
