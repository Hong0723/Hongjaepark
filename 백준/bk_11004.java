package 백준;

import java.util.Arrays;
import java.util.Scanner;

public class bk_11004 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int K = s.nextInt();

        int[] n = new int[N];

        for(int i=0; i<N; i++) {
            n[i] = s.nextInt();
        }

        Arrays.sort(n);

        System.out.println(n[K-1]);


    }
}