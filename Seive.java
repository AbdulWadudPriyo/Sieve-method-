  
package com.mycompany.mavenproject1;

 public class SieveOfEratosthenes {

    
    public static void sieveOfEratosthenes(int n) {
        
        boolean[] isPrime = new boolean[n + 1];
        
        
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        
        isPrime[0] = isPrime[1] = false;

        
        for (int p = 2; p * p <= n; p++) {
            
            if (isPrime[p]) {
                
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        // Print all prime numbers
        System.out.println("Prime numbers smaller than or equal to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

   
}


