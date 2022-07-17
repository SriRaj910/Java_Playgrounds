package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int length = ss.nextInt();
        int width = ss.nextInt();

        System.out.println("Area of rectangle is : "+ length*width);
    }
}
