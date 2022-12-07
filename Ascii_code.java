/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ascii_code;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Ascii_code {

    public static void main(String[] args) {
        int ascii;
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.print("enter ascii code");
        ascii = input.nextInt();
        ch = (char) ascii;

        System.out.println("the first char is" + ch);

    }
}
