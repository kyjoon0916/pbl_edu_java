package Pbl_java2;
import java.util.Scanner;
class Book {
    String title;
    String author;
    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }
}

public class Ex_4_7{
    public static void main(String[] args) {
        Book [] book = new Book[2];
        Scanner ipt = new Scanner(System.in);
        for(int i =0;i<book.length;i++){
            System.out.print("제목>>");
            String title = ipt.nextLine();
            System.out.print("저자>>");
            String author =ipt.nextLine();
            book[i] = new Book(title, author);
        }
        for(int i =0;i<book.length;i++)
            System.out.print("("+ book[i].title +","+book[i].author+")");
        ipt.close();
    }    
}
