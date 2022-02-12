package com.rescursion;

public class PowerUsingRec {
    public static void main(String[] args) {
        int base=2;
        int pow=2;
        System.out.println(power( base, pow));
    }
    static int power(int base , int pow){
        if(pow==0)
            return 1;
        return base *power(base,pow-1);

    }
}
