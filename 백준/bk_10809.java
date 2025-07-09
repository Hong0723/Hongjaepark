package 백준;

import java.util.*;

public class bk_10809 {

    public static void main(String[] args) throws Exception {

    Scanner s = new Scanner(System.in);
    System.out.print("단어를 입력하시오: ");
    String a = s.next();
    int[] A = new int[26];
    for(int i=0; i<A.length;i++){
        A[i] = -1;
    }
    for(int j=0; j<a.length(); j++){
        char c = a.charAt(j);

        if(A[c-'a']==-1){
            A[c-'a'] = j;
        }
    }
    for(int i=0; i<A.length;i++){
    System.out.println(A[i]);
    }



    }

    }
