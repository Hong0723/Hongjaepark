package 백준;

import java.util.Scanner;
public class bk_11720 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int S =  s.nextInt();
        String A = s.next();
        int sum = 0;
        for(int i = 0; i < S; i++) {
        sum += A.charAt(i) - '0';
                    }
        System.out.println(sum);
    }
}
