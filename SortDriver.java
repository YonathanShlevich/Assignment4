/**
 * SortDriver.java: by Koushik Ramakrishnan and Yonathan Shlevich
 */
import java.util.Arrays;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SortDriver {
    
    public static void main(String[] args) {

        //Taking an input from a file
        ArrayList<String> a = new ArrayList<>(); // the arraylist of command line args
        for(String s : args){
            a.add(s);
        }
        Path filePath = Paths.get(a.get(0)); 
        System.out.println(filePath);
        ArrayList<String> preIntArray;
        ArrayList<Integer> intArr= new ArrayList<>();
        intArr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        //Try catch loop for getting and splitting the file
        try{
            String input = Files.readString(filePath);
            System.out.println();
            if(input.length() != 0){
                preIntArray = new ArrayList<>(Arrays.asList(input.split(" ")));
                //intArr = new ArrayList<>();
                for(String v : preIntArray){
                    intArr.add(Integer.parseInt(v)); //converts the string objects to integer arraylist
                }
            }
            
           
        } //Try
        catch(IOException i){
            i.printStackTrace();

        }  //Catch
    } 
}
