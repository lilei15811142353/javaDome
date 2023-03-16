package com.test.cycle;

public class DomeTest {
    public static void main(String[] args) {
        int sumfor = 0;
        for(int i = 1; i<=100 ; i++){
            if (i%2==0){
                sumfor += i;
            }
        }
        System.out.println("1-100所有偶数的和:" + sumfor);

        int sumwhile = 0;
        int j = 1;
        while (j<=100){
            if (j%2==0){
                sumwhile += j;
            }
            j++;
        }
        System.out.println("1-100所有偶数的和:" + sumwhile);

        int sumdowhile = 0;
        int k = 1;
        do{
            if (k%2==0){
                sumdowhile += k;
            }
            k++;
        }while (k<=100);
        System.out.println("1-100所有偶数的和:" + sumdowhile);
    }
}
