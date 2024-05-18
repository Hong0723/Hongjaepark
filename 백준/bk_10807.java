package 백준;

import java.util.Scanner;

public class bk_10807 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        int count = 0;
        for(int i = 0 ; i< A.length ;i++){
            A[i] = s.nextInt();
        }
        int W = s.nextInt();
        for(int p =0; p< A.length; p++) {
            if (A[p] == W) {
                count++;
            }

        }
        System.out.println(count);





    }
}
