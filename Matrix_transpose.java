/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matrix_transpose;
import java.util.Scanner;


/**
 *
 * @author hp
 */
public class Matrix_transpose {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        int row,column,i,j;
        System.out.println("enter the matrix row");
        row=input.nextInt();
         System.out.println("enter the matrix column");
         column=input.nextInt();
         int[][]arr=new int[row][column];
          System.out.println("enter your matrix elemant");
          for ( i=0;i<row;i++){
              for( j=0;j<column;j++){
                  arr[i][j]=input.nextInt();
                   System.out.println("     ");
              }
          }
           System.out.println("the matrix before traspose is ");
            
        for ( i=0;i<row;i++){
              for( j=0;j<column;j++)
                  System.out.println(arr[i][j]);
                  
              
    }
        System.out.println("the matrix after trnspose is");
        for ( i=0;i<column;i++){
              for( j=0;j<row;j++)
                  System.out.print(arr[j][i]);
              
             }
              
}
    
}
