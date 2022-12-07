/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arrey_max;

/**
 *
 * @author hp
 */
public class Arrey_max {

    public static void main(String[] args) {
        double [] arr={15,12.5,20,30,14,22,27};
        double max=0;
        for(int i=0;i<7;i++){
            if(max<arr[i])
                max=arr[i];
            
        }
        System.out.println("the max element of the arr is "+max);
        
    }
    
}
