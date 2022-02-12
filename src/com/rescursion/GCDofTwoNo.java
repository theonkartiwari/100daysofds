package com.rescursion;

public class GCDofTwoNo {
    public static void main(String[] args) {
        int a=18,b=4;
        System.out.println(gcd(a,b));
    }
    static int gcd(int a,int b){
        if(a<0 || b<0)
            return -1;
        if(b==0)
            return a;
        return gcd(b,a%b);
    }
}
