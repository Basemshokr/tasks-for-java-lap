/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.tabadle_twafeq;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Tabadle_twafeq {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int r, n, ncr, fact = 1, num=0, denom=0, i = 1, sub;
        System.out.print("enter the value of n");
        n = input.nextInt();
        System.out.print("enter the value of r");
        r = input.nextInt();
        while (i <= n) {
            fact = fact * i;
            i++;

        }
        num = fact;
        sub = n - r;
        fact = 1;
        i = 1;
        while (i <= sub) {
            fact = fact * i;
            i++;

        }
        denom = fact;
        fact = 1;
        i = 1;
        while (i <= r) {
            fact = fact * i;
            i++;

        }

        denom = (fact * denom);
       
        ncr = (num / denom);


        System.out.print("ncr is" + ncr);

    }
}
