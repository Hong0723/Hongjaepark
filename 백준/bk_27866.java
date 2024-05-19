package 백준;

import java.util.Scanner;
public class bk_27866 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S;
        int i;
        System.out.println("단어를 입력하시오 : ");
        S = sc.next();
        i = sc.nextInt();
        char T = S.charAt(i-1);
        System.out.println(T);
    }
}
