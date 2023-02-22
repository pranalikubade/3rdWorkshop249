package com.bridgelabz;

public class PrimeNumber {
    public static void main(String[] args) {
        int sum=0;
        int [] nonPrimeNum=new int[100];
        int nonPrimeCount=0;
        for (int i=2;i<100;i++){
            boolean isPrime=true;
            for (int j = 2; j <i ; j++) {
                if (i%j==0){
                    isPrime=false;
                    nonPrimeNum[nonPrimeCount++]=i;
                    break;

                }

            }
            if(isPrime){
              //  System.out.println(i);
                 sum=sum+i;
                System.out.println("Sum of Prime Number :"+sum);
                System.out.println(" Non Prime Numbers are :");
                for (int k = 0; k < nonPrimeCount; k++) {
                    System.out.println(nonPrimeNum[k]+ " ");

                }

            }
        }
    }
}
