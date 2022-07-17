package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class Average10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        double avg;
        double n;
        for (int i=0;i<10;i++)
        {
            n=sc.nextInt();
            sum+=n;

        }
        avg=sum/10;
        System.out.println("Average of the numbers: "+avg);
    }
}
