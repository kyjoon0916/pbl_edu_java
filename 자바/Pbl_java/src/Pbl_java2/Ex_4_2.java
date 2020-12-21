package Pbl_java2;
import java.util.Scanner;

public class Ex_4_2 {
    int width;
    int height;
    public int getArea(){
        return width*height;
    }
    public static void main(String[] args){
        Ex_4_2 rect = new Ex_4_2();
        Scanner ipt = new Scanner(System.in);
        System.out.print(">>");

        rect.width =ipt.nextInt();
        rect.height=ipt.nextInt();
        System.out.print("사각형의면적은 "+rect.getArea());
        ipt.close();
    }
}
