package com.mycompany.mavenproject1;

import java.util.Scanner;

public class Main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        SieveOfEratosthenes soe = new SieveOfEratosthenes();
        soe.sieveOfEratosthenes(n);

        
        
    }
}
