package Pbl_java2;
public class Ex_4_4 {
    String title;
    String author;

    public Ex_4_4(String t){
        title = t; author ="작자미상";
    }
    public Ex_4_4(String t ,String a){
        title = t; author = a;
    }
    public static void main(String[] args){
        Ex_4_4 littlePrince = new Ex_4_4("어린왕자","생택쥐페리");
        Ex_4_4 loveStory = new Ex_4_4("춘향전");
        System.out.println(littlePrince.title +" "+ littlePrince.author);
        System.out.println(loveStory.title+" "+loveStory.author);
    }    
}
