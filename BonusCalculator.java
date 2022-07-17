package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int salary = ss.nextInt();
        int years = ss.nextInt();

        if(years > 5)
            System.out.println("Bonus: "+salary*0.05);
        else
            System.out.println("Bonus: 0");
    }
}
