package 백준;

import java.util.Scanner;
public class bk_9086 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String[] t = new String[n];
        for (int i =0; i < n; i++){
            t[i] = s.next();
        }
        for(int p=0; p<n; p++){
            System.out.print(t[p].charAt(0));
            System.out.println(t[p].charAt(t[p].length()-1));
        }

    }
}