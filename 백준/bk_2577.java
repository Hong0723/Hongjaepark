package 백준;

import java.util.*;

public class bk_2577 {
    public static void main(String[] args) throws Exception {
    Scanner s = new Scanner(System.in);
    System.out.print("정수를 입력하시오:");
    int a = s.nextInt();
    System.out.print("정수를 입력하시오:");
    int b = s.nextInt();
    System.out.print("정수를 입력하시오:");
    int c = s.nextInt();
    int d = a * b * c;

    int[] counts = new int[10];
    while (d > 0){
        counts[d % 10]++;
        d /= 10;
    }

    for(int i =0; i<counts.length; i++) {
        System.out.println(i + "의 개수 : " + counts[i]);
    }
    }
}