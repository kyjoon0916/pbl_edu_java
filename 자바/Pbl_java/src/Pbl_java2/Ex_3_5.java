package Pbl_java2;
import java.util.Scanner;
public class Ex_3_5 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        System.out.println("정수를 5개를 입력하시오");
        int sum = 0;
        for(int i =0;i<5;i++){
            int n = ipt.nextInt();
            if(n<=0)
                continue;
            else
                sum +=n;
        }
        System.out.println("앙수의합은"+sum);
        ipt.close();
    }
}
