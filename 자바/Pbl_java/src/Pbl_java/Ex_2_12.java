package Pbl_java;
import java.util.Scanner;
public class Ex_2_12 {
    public static void main(String[] args){
        char grade;
        Scanner ipt = new Scanner(System.in);

        System.out.print("점수를 입력하세요(0~100):");
        int score = ipt.nextInt();
        if(score>=90)
            grade = 'A';
        else if(score>=90)
            grade = 'B';
        else if(score >=70)
            grade = 'C';
        else if(score>=60)
            grade = 'D';
        else 
            grade = 'F';
        System.out.println("학점은"+grade+"입니다");

        ipt.close();
    }  
}
