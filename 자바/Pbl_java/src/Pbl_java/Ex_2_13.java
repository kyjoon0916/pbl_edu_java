package Pbl_java;
import java.util.Scanner;
public class Ex_2_13 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);

        System.out.print("점수를 입력하세요");
        int score = ipt.nextInt();

        System.out.print("학년을 입력하세요");
        int year = ipt.nextInt();

        if(score >= 60){
            if(year!=4)
                System.out.println("합격");
            else if(score >=70)
                System.out.println("합격!");
        else
            System.out.println("불합격");
        }
        else
            System.out.println("불합격");
        ipt.close();
        
    }
}
