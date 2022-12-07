/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.shaps_area;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class Shaps_area {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double x, y = 3.14;
        System.out.println("enter your radis pleas");
        x = input.nextDouble();
        System.out.println("the area of circle is");
        circle_area(x, y);
        double length, width;
        System.out.println("pleas enter the rect length");
        length = input.nextDouble();
        System.out.println("pleas enter the rect width");
        width = input.nextDouble();
        System.out.println("the area of rectangle is ");
        rectan_area(length, width);
        double L;
        System.out.println("pleas enter the cube length");
        L = input.nextDouble();
        System.out.println("the cube area is ");
        cube_area(L);

    }

    public static double circle_area(double r, double bay) {

        double circle_area;
        circle_area = bay * r * r;
        return circle_area;

    }

    public static double rectan_area(double length, double width) {

        double rectngle_area;
        rectngle_area = length * width;
        return rectngle_area;

    }

    public static double cube_area(double L) {

        double area_cube;
        area_cube = L * L * L;
        return area_cube;

    }
}
