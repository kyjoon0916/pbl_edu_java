package Pbl_java;
import java.util.Scanner;
public class Ex_2_14 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        char grade;
        System.out.print("점수를 입력하시오");
        int score = ipt.nextInt();
        switch(score/10){
            case 10:
            case 9:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("학점은"+grade+"입니다");
        ipt.close();
    }
}
