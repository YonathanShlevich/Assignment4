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
            int[] Iarr = new int[intArr.size()]; 
            for(int i = 0 ; i < intArr.size(); i++){
                Iarr[i] = intArr.get(i);
            }
            Sorter toSort = new Sorter();
            System.out.println("selection-sort (s) merge-sort (m) heap-sort (h) quick-sort-fp (q) \n quick-sort-rp (r)");
            System.out.print("Enter the algorithm: ");
            char choice = scan.next().charAt(0);
            if(choice == 's'){
                toSort.selectionSort(Iarr);
                System.out.print("#Selection-sort comparisons: ");
                toSort.getCounter();
            } else if(choice == 'm'){
                toSort.mergeSort(Iarr,Iarr.length);
                System.out.print("#Merge-sort comparisons: ");
                toSort.getCounter();
            } else if(choice == 'h'){
                toSort.heapSort(Iarr, Iarr.length);
                System.out.print("#Heap-sort comparisons: ");
                toSort.getCounter();
            } else if(choice == 'q'){
                toSort.quickSort(Iarr, 0, Iarr.length - 1);
                System.out.print("#Quick-sort-fp comparisons: ");
                toSort.getCounter();
            } else if(choice == 'r'){
                toSort.quicksortSecRan(Iarr, 0, Iarr.length - 1);
                System.out.print("#Quick-sort-rp comparisons: ");
                toSort.getCounter();
            }
           
        } //Try
        catch(IOException i){
            i.printStackTrace();

        }  //Catch
    }

}