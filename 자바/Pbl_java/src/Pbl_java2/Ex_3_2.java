package Pbl_java2;
import java.util.Scanner;
public class Ex_3_2 {
    public static void main(String[] args){
        int count =0;
        int sum =0;
        Scanner ipt = new Scanner(System.in);
        System.out.println("점수를 입력하고 마지막에 -1 을 입력하시오");
        int n = ipt.nextInt();
        while(n != -1){
            sum+= n;
            count++;
            n= ipt.nextInt();

        }
        if(count == 0)System.out.println("입력된 수가 없습니다");
        else{
            System.out.println("점수의개수는"+count+"개이며");
            System.out.println("평균은"+(double)sum/count+"입니다");
        }
        ipt.close();
    }
}
