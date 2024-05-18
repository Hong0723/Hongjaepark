package 백준;

import java.util.Scanner;

public class bk_10871 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int X = s.nextInt();
        int[] Q = new int[N];
        for(int i =0; i < Q.length; i++){
            Q[i] = s.nextInt();
        }
        for(int q = 0; q < Q.length; q++) {
            if (Q[q] < X) {
                System.out.print(Q[q] + " ");

            }
        }

    }
}

