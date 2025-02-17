package Java;

import java.util.*;
public class Lab2 {
    // 1번
    public static int forecast(){
        Random random = new Random();
        int cort = random.nextInt(101);
        return cort;
    }

    // 2번
    public static double decimalValue(double decimalValue){
        double decimalpart = decimalValue - Math.floor(decimalValue);
        decimalpart = Math.round(decimalpart*1000.0)/1000.0;
        return  decimalpart;
    }

    // 3번
    public static void bacteria(int minutes, int bacterium) {
        int times = 0;
        int totalbacteria = 1;
        for (int i = 0; i < bacterium; i++) {
            totalbacteria *= 2;
            times += minutes;
            System.out.println("after " + times + " minutes : " + totalbacteria + " bacteria");
        }
    }
    // 4번
    public static void convertToCopper(int gp, int sp, int cp){
        int totalCopper = gp * 50 + sp * 5 + cp ;
        System.out.println(gp + " gp," + sp + " sp," + cp + " cp converted to copper is : " + totalCopper);
    }
    public static void convertFromCopper(int copper){
        int gp = copper / 50 ;
        int sp = (copper % 50) / 5;
        int cp = copper % 50 % 5;
        System.out.println(copper + " cooper pieces is : " + gp + " gp," + sp + " sp," +  cp + " cp");
    }

    // 5번
    public static void repeatWord(String word, int row, int column){
        for(int i = 0 ; i < row ; i ++ ){
            for(int q = 0 ; q < column ; q ++ ){
                    System.out.print(word);
            }
            System.out.println();
        }
    }

    // 6번
    public static String repeatCharacter(String word, int repeattime){
        StringBuilder repeatword = new StringBuilder();
        for (int i = 0; i < word.length(); i++){
            char Character = word.charAt(i);
            for ( int q=0; q< repeattime; q++){
            repeatword.append(Character);

            }
        }
        return repeatword.toString();
    }

    // 7번
    public static void textTriangle(int a){
        for(int i = 0; i < a ; i ++){
            for(int q = 0; q <= i; q ++){
                System.out.print("X");
            }
        System.out.println();
        }
    }

    // 8번
    enum beefTypeEnum{
        HAMBURGER,
        CHUCK,
        ROUND,
        SIRLOIN,
        UNKNOWN
    }
    public static String beefType(double percentLean){

        if(percentLean < 78){
            return "Hamberger";
        }
        else if (percentLean >= 78 && percentLean < 85){
            return "Chuck";
        }
        else if (percentLean >= 85 && percentLean < 90 ){
            return "Round";
        }
        else if (percentLean >= 90 && percentLean < 95){
            return "Sirloin";
        }
        else {
            return "Unknown";
        }
    }

    public static String beefTypeEnum(double percentLean){
        if(percentLean < 78){
            return beefTypeEnum.HAMBURGER.name();
        }
        else if (percentLean >= 78 && percentLean < 85){
            return beefTypeEnum.CHUCK.name();
        }
        else if (percentLean >= 85 && percentLean < 90 ){
            return beefTypeEnum.ROUND.name();
        }
        else if (percentLean >= 90 && percentLean < 95){
            return beefTypeEnum.SIRLOIN.name();
        }
        else {
            return beefTypeEnum.UNKNOWN.name();
        }
    }

        // 9번
    public static void isNormalBloodPressure(int top, int bottom)
    public static void main(String[] args) {
        // 1번
        int cort = forecast();
        System.out.println("비가 올 확률은 : " + cort);

        // 2번
        System.out.println("5.983 Decimal value : " + decimalValue(5.983));

        // 3번
        bacteria(21, 3);

        // 4번
        convertToCopper(5, 10, 7);
        convertFromCopper(1107);

        // 5번
        repeatWord("Carrot", 3, 5);

        // 6번
        System.out.println("Carrot Repeat each character three times --> " + repeatCharacter("Carrot",3));

        // 7번
        textTriangle(3);

        // 8번
        System.out.println("beefType(95.1) -->" + beefType(95.1));
        System.out.println("beefType(87) --> " + beefTypeEnum(87));
    }



}
