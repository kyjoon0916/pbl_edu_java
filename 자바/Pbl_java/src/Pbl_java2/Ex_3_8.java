package Pbl_java2;
import java.util.Scanner;
public class Ex_3_8 {
    public static void main(String[] args){
        int intArray[] = new int[5];
        int sum=0;

        Scanner ipt = new Scanner(System.in);
        System.out.println("숫자를 5개 입력하시오");
        for(int i=1;i<intArray.length;i++){
            intArray[i]=ipt.nextInt();
        }
        for(int j=0;j<intArray.length;j++){
            sum +=intArray[j];
        }

        System.out.print("숫자들의 평균: "+(double)sum/intArray.length);
        
        ipt.close();
    }
}

