package com.company;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Write your list of names seperated by commas: ");
        String[] names = new Scanner(System.in).nextLine().split(",");
        System.out.println("How many people do you want picked from you list? (input a number): ");
        int numOfNames = new Scanner(System.in).nextInt();
        System.out.println("Here are your random names!!");
        System.out.println(getNames(names, numOfNames));

    }

    static String getNames(String[] names, int num){
       String output = "";
       for(int i=0; i<num; i++){
           if(i!=0){
               output += ", ";
           }
           Random rand = new Random();
           int index = rand.nextInt(names.length);
           output +=  names[index];
//           take out the already picked names
           names = slice(names, index);
       }
       return output;
    }

//    takes out one item out of an array, returns new array
    static String[] slice(String[] array, int index){
        String[] newArray = new String[array.length-1];
        int counter = 0;
        for(int i=0; i<array.length; i++){
            if(i != index){
                newArray[counter] = array[i];
                counter++;
            }
        }
        return newArray;
    }
}
