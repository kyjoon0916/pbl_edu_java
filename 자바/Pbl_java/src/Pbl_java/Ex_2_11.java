package Pbl_java;
import java.util.Scanner;
public class Ex_2_11 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        System.out.print("수 입력하시오:");
        int number = ipt.nextInt();

        if (number %3 ==0)
            System.out.println("3의 배수 입니다.");
        else
            System.out.println("3의 배수가 아닙니다.:");
        
        ipt.close();
    }
    
}
