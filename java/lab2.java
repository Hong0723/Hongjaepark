package java;

import java.util.*;
public class lab2 {
    // 1번
    public static int forecast(){
        Random random = new Random();
        int cort = random.nextInt(101);
        return cort;
    }

    //2번
    public static double decimalValue(double decimalValue){
        double decimalpart = decimalValue - Math.floor(decimalValue);
        decimalpart = Math.round(decimalpart*1000.0)/1000.0;
        return  decimalpart;
    }
    public static void main(String[] args){
        // 1번
        int cort = forecast();
        System.out.println("비가 올 확률은 : " + cort);

        // 2번
        System.out.println("5.983 Decimal value : " + decimalValue(5.983));
    }

}