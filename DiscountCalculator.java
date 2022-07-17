package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class DiscountCalculator {
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int singleUnit = 100;
        int quantity = ss.nextInt();

        int totalCost = singleUnit*quantity;
        if(totalCost > 1000)
            System.out.println(totalCost - totalCost*0.1);
        else
            System.out.println(totalCost);
    }
}
