package Pbl_java2;
import java.util.Scanner;
public class Ex_3_6 {
    public static void main(String[] args){
        Scanner ipt = new Scanner(System.in);
        System.out.println("exit 를 입력하시면 종료합니다.");
        while(true){
            System.out.print(">>");
            String text = ipt.nextLine();
            if(text.equals("exit"))
                break;
        }
        System.out.println("종료합니다.");
        ipt.close();
        }
    }

