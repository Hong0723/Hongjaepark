package 백준;

import java.util.Scanner;

public class bk_3003 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] N = new int[6];
        int[] P = {1,1,2,2,2,8};
        int Sum;
        for (int i = 0; i < N.length; i++){
            N[i] = s.nextInt();
            Sum = P[i] - N[i];
            System.out.print(Sum + " ");

        }


    }
}
