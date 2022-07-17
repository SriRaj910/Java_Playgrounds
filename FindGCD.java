package com.ultralessen.javaPlayG1;

import java.util.Scanner;

public class FindGCD {
    public int calculate(int n1, int n2){
        if(n1 == 0 || n2 == 0) return n1+n2;
        return calculate(n2,n1%n2);
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
        int b = ss.nextInt();

        FindGCD o1 = new FindGCD();
        int g = o1.calculate(a,b);


        System.out.println(" GCD: "+g);
    }
}
