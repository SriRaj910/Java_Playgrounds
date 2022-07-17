package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class IfSquare {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int length = ss.nextInt();
        int width= ss.nextInt();

        if(length == width)
            System.out.println("It is a Square");
        else
            System.out.println("It is not a Square");
    }
}
