package 백준;

import java.util.Scanner;

public class bk_1003 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        int[] ZeroCount = new int[41];
        int[] OneCount = new int[41];

        ZeroCount[0] = 1;
        ZeroCount[1] = 0;
        OneCount[0] = 0;
        OneCount[1] = 1;

        for(int i =2; i<=40;i++){
            ZeroCount[i] = ZeroCount[i-1] + ZeroCount[i-2];
            OneCount[i] = OneCount[i-1] + OneCount[i-2];
        }

        for(int i =0; i< t; i++){
            int a = s.nextInt();
            System.out.println(ZeroCount[a] + " " + OneCount[a]);
        }
    }
}