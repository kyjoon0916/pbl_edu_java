package javaClassEx;
import java.util.Scanner;
import java.util.Set;
public class Datetest {
    public static void main(String[] args){
        DateCheck date = new DateCheck();
        date.setYear(2020);
        date.setMonth(77);
        date.setDay(90);
        date.showDate();
        DateCheck date2 = new DateCheck();
        date2.setYear(2002);
        date2.setMonth(20);
        date2.setDay(17);
        date2.showDate();
    }
}
