package com.bridgelabz;

public class PrimeNonPrime {
    public static void main(String[] args) {
        int[] temp = new int[100];
        int count=0;
        int sum=0;
        System.out.println("Prime Numbers are");
        for (int i = 2; i <100 ; i++) {
            if (isPrime(i)){
                sum=sum+i;
                System.out.println(i);
            }else {
                temp[count]=i;
                count++;
            }

        }
        System.out.println("Sum of Prime Numbers : " +sum);
        System.out.println("Non-prime numbers are ");
        for (int i = 0; i <count ; i++) {
            System.out.println(temp[i]);

        }
    }

    public static boolean isPrime(int n){
        if (n<1){
            return false;
        }
        for (int i = 2; i <n ; i++) {
            if (n%i==0){
                return false;
            }

        }
        return true;
    }
}
