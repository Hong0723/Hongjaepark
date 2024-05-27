package 백준;

import java.util.Scanner;
public class bk_10810 {
        public static void main(String[] args){
            Scanner s = new Scanner(System.in);
            int N = s.nextInt();
            int M = s.nextInt();
            int [] Arr =  new int[N];
        for ( int q=0; q<M;q++) { // N번 만큼 반복
            int i = s.nextInt();
            int j = s.nextInt();
            int k = s.nextInt();
            for (int w = i - 1; w < j; w++) {
                Arr[w] = k;
            }
        }
            for (int e = 0; e < N; e++) {
                System.out.print(Arr[e] + " ");
            }





        }
}
