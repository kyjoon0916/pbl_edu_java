package Pbl_java2;
import java.util.Scanner;
public class Ex_3_7 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        int intArray[] = new int[5];

        int max=0;
        System.out.println("양수 5개를 입력하시오");
        for(int i = 0;i<5;i++){
            intArray[i] = ipt.nextInt();
            if(intArray[i]>max){
                max =intArray[i];
            }
        }
        System.out.print("가장큰수는"+max+"입니다.");
        ipt.close();
    }
}
