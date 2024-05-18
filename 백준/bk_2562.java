package 백준;


import java.util.Scanner;

public class bk_2562 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] x = new int[9];
        int max = x[0];
        int count = 0;
        System.out.println("9개의 정수를 입력하시오 : ");

        for(int i =0; i < x.length; i++){
        x[i] = s.nextInt(); }

        for ( int y = 0; y < x.length; y++){
            if (x[y] > max){
                max = x[y];
                count = y + 1;

            }
        }
    System.out.println("최댓값은 : " + max );
        System.out.println(count);





    }
}
