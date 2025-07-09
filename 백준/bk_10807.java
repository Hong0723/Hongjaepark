package 백준;

import java.util.Scanner;

public class bk_10807 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("정수의 개수를 입력하시오:");
        int a = sc.nextInt();
        int[] b = new int[a];
        System.out.print("정수를 입력하시오:");
        for (int i = 0; i < b.length; i++) {
            b[i] = sc.nextInt();
        }
        System.out.print("찾으려고 하는 정수를 입력하시오 :");
        int c = sc.nextInt();
        for (int j = 0; j < b.length; j++) {
            if (b[j] == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}