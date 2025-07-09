package 백준;

import java.util.Scanner;
import java.util.Arrays;

public class bk_10818 {
    public  static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("정수의 개수를 입력하시오: ");
        int a = s.nextInt();
        int[] b = new int[a];

        for(int i =0; i<b.length;i++){
            System.out.print("정수를 입력하시오:");
            b[i] = s.nextInt();
        }
        int min = b[0];
        int max = b[0];
        for(int j=0; j<b.length; j++){
            if(b[j] < min) {
                min = b[j];
            }
        }
        for(int p=0; p<b.length; p++){
            if(b[p]> max) {
                max = b[p];
            }
        }
        System.out.println("최솟값은 : " + min);
        System.out.println("최댓값은 : " + max);



    }
}
