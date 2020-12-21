package Pbl_java3;
class Shape{
    public Shape next;
    public Shape() {next=null;}
    public void draw(){
        System.out.println("Shape");
    }
}
class Line extends Shape{
    public void draw(){
        System.out.println("line");
    }
}
class Rect extends Shape{
    public void draw(){
        System.out.println("Rect");
    }
}
class Circle extends Shape{
    public void draww(){
        System.out.println("Circle");
    }
}
public class Ex_5_5 {
    static void paint(Shape p){
        p.draw();
    }   
    public static void main(String[] args){
        Line line = new Line();
        paint(line);
        paint(new Shape());
        paint(new Line());
        paint(new Rect());
        paint(new Circle());
    }
}
