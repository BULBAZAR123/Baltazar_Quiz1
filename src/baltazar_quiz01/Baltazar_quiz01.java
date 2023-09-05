/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baltazar_quiz01;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Baltazar_quiz01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Code1();
    }

public static void Code1(){
        int[] OrigArr = {82, 44, 96, 7, 13, 56, 74, 14, 98, 36};
        System.out.println("Your Array: " + Arrays.toString(OrigArr));
        
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter an Array: ");
        int num = scn.nextInt();
        
        System.out.println("Choose a the Array you want to be Inserted: ");
        System.out.println(Arrays.toString(OrigArr));
        int element = scn.nextInt();
        
  if(element > 0 && element <= OrigArr.length){   
      
      int[] newArray = new int[OrigArr.length + 1];
  
        for (int i = 0; i <= element; i++) {
            newArray[i] = OrigArr[i];
    }
        
        newArray[element] = num;
       
        for (int i = element; i < OrigArr.length; i++) {
        newArray[i + 1] = OrigArr[i];
    }
        
        System.out.println("Orig Array: " + Arrays.toString(OrigArr));
        System.out.println("Element Inserted" + num);
        System.out.println("New Array" + Arrays.toString(newArray));
    }
  
}

public static void Code3(){
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter an how many arrays: ");
    int arrays = scn.nextInt();
    System.out.println("Enter Elements: ");
    int elements = scn.nextInt();
    
    int[] origarr;
    
}
    }
