package Pbl_java3;
class Point{
    private int x,y;
    public void set(int x, int y){
        this.x = x; this.y =y;
    }
    public void showPoint(){
        System.out.println("("+ x +","+y+")");
    }
}
class ColorPoint extends Point {
    private String color;
    public void setColor(String color){
        this.color = color;
    }
    public void showColorPoint(){
        System.out.print(color);
        showPoint();
    }
}
public class Ex_5_1 {
    public static void main(String[] args){
        Point P = new Point();
        P.set(1,2);
        P.showPoint();

        ColorPoint cp = new ColorPoint();

        cp.set(3,4);
        cp.setColor("red");
        cp.showColorPoint();
    }
}
