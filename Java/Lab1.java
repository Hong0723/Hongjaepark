package Java;

import java.util.Random;
import java.util.Scanner;
public class Lab1 {
    public static void main(String[] args) {
        // 1번 피타고라스
        System.out.println("1번 피타고라스에 대한 문제");
        Scanner D = new Scanner(System.in);
        System.out.print("거리를 입력하시오 : ");
        double Distance = D.nextDouble();
        Scanner H = new Scanner(System.in);
        System.out.print("높이를 입력하시오 : ");
        double Height = H.nextDouble();
        double Length = Math.sqrt(Math.pow(Distance, 2) + Math.pow(Height, 2));
        System.out.println("대각선의 길이는 : " + Length);


        // 2번 실수의 소수부분 구하기
        System.out.println("2번 실수의 소수부분 구하기");
        Scanner S = new Scanner(System.in);
        System.out.print("실수를 입력하시오 : ");
        double number = S.nextDouble();
        double integerpart = Math.floor(number);
        double demicalpart = number - integerpart;
        double demicalvalue = Math.round(demicalpart*1000.0)/1000.0 ;
        System.out.println("소수 부분의 값은 : " + demicalvalue);


        // 3번 원통의 넓이 구하기
        System.out.println("3번 원통의 넓이 구하기");
        Scanner Q = new Scanner(System.in);
        System.out.print("반지름을 입력하시오 : ");
        double radius = Q.nextDouble();
        Scanner W = new Scanner(System.in);
        System.out.print("높이를 입력하시오 :");
        double Height1 = W.nextDouble();
        double Surfacearea = Math.pow(radius,2) * Math.PI * Height1;
        Surfacearea = Math.round(Surfacearea*1000.0)/1000.0;
        System.out.println("원통의 넓이는 : " + Surfacearea);


        // 4번 for문을 이용한 원통의 표면적 구하기
        System.out.println("4번 for문을 이용한 원통의 표면적 구하기");
        for(double p = 1.0; p <= 10.0 ; p += 0.5){
            double radius1 = p;
            double height1 = p;
            double Surfacearea1 = 2 * Math.PI * (Math.pow(radius1,2) + radius1 * height1);
            Surfacearea1 = Math.round(Surfacearea1*1000.0)/1000.0;
            System.out.println("원통의 표면적은 : "+ Surfacearea1);}
            System.out.println();

        // 4-1번 While문을 이용한 원통의 표면적 구하기
        System.out.println("4-1번 while 문을 이용한 표면적 구하기");
        double m = 1.0;
        while (m<=10.0){
            double Surfacearea2 = 2 * Math.PI * (Math.pow(m,2) + m * m);
            Surfacearea2 = Math.round(Surfacearea2 * 1000.0)/1000.0;
            System.out.println("원통의 표면적은 : "+ Surfacearea2);
            m += 0.5;
        }
            System.out.println();

        // 4-2번 Scanner함수를 이용한 원통의 표면적 구하기
        System.out.println("4-2번 Scanner함수를 이용한 원통의 표면적 구하기");
        Scanner P =  new Scanner(System.in);
        System.out.print("반지름을 입력하시오 : " );
        double radius2 = P.nextDouble();
        Scanner O = new Scanner(System.in);
        System.out.print("높이를 입력하시오 : " );
        double height2 = O.nextDouble();
        double Surfacearea3 = 2 * Math.PI * (Math.pow(radius2,2) + radius2 * height2);
        Surfacearea3 = Math.round(Surfacearea3 * 1000.0)/1000.0;
        System.out.println("원통의 표면적은 : "+ Surfacearea3);


        // 5번 주사위를 굴려 그 합을 구함
        System.out.println("5번 주사위의 값을 랜덤으로 받아 그 값을 출력하고 합을 출력");
        Random r = new Random();
        int total = 0 ;
        int count = 0 ;
        do {
            int roll = r.nextInt(6)+ 1;
            total += roll;
            count++;
            System.out.println("주사위의 숫자 : " + roll);
            if (roll == 1) {
                total -= roll;
                count--;
                System.out.println("re-rolling");
            }
        } while ( count <5);
        System.out.println("주사위의 총합은 : "+ total);
        }
        }
