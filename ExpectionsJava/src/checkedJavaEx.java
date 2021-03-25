import java.io.*;
import java.util.Scanner;


//Checked Examples
public class checkedJavaEx {
    public static void main(String[] args) throws FileNotFoundException {
        //Example1
        System.out.println("Example 1. Function creates a file: ");
        readfile();

        //Example2
        System.out.println("Example 2. Function reads a file: ");
        readText();


    }

    //Example 1
    //Function creates a file
    static public void readfile() throws FileNotFoundException {
        try{
            FileInputStream myFile = new FileInputStream("");
        }catch (FileNotFoundException e){
            System.out.println("We´re sorry your file couldn´t be found");
        }finally {
            System.out.println("Rest of the program Readfile \n");
        }
    }

    //Example 2
    //Main
    static public void readText() {
        try {

            readthis();
        } catch (FileNotFoundException error){
            System.out.println(error.getMessage());
        }finally {
            System.out.println("Rest of readText");
        }
    }

    //Function that reads the file to readText
    static public void readthis() throws FileNotFoundException{
        try{
        File myTxt = new File("");
        Scanner reader = new Scanner(myTxt);
        while (reader.hasNext()) {
            boolean status = true;
            System.out.println("Successfully read" + status);
        }

        }catch(FileNotFoundException error){
            throw new FileNotFoundException("Failed process");
        }

    }

}
