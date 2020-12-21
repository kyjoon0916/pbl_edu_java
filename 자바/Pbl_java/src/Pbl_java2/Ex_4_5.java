package Pbl_java2;
public class Ex_4_5 {
    String title;
    String author;
    void show(){System.out.println(title+ " "+ author);}

    public Ex_4_5(){
        this("","");
        System.out.println("생성자 호출됨");
    }
    public Ex_4_5(String title){
        this(title, "작자미상");
    }
    public Ex_4_5(String title, String author){
        this.title = title; this.author = author;
    }
    public static void main(String[] args){
        Ex_4_5 littlePrince = new Ex_4_5("어린왕자","생택쥐페리");
        Ex_4_5 loveStory = new Ex_4_5("춘향전");
        Ex_4_5 emptyBook = new Ex_4_5();
        loveStory.show();
    }
}
