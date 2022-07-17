package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class GreatestOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b= sc.nextInt();
        System.out.println("Greatest : "+ ((a>b)?a:b));
    }
}
