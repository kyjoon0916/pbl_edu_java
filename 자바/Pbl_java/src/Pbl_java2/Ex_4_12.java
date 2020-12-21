package Pbl_java2;
import java.util.Scanner;

class CurrencyConverter{
    private static double rate;
    public static double toDollar(double won){
        return won/rate;
    }
    public static double toKWR(double dollar){
        return dollar*rate;
    }
    public static void setRate(double r){
        rate =r;
    }
}
public class Ex_4_12 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        System.out.println("환율(1달러)>>");
        double rate = ipt.nextDouble();
        CurrencyConverter.setRate(rate);
        System.out.println("백만원은 $"+CurrencyConverter.toDollar(10000000)+"입니다");
        ipt.close();
    }
}
