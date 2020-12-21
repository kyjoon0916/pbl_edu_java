package Pbl_java2;
public class Ex_4_1 {
    
        int radius;
        String name;
        
        public double getArea(){
            return 3.14*radius*radius;
        
    }
    public static void main(String[] args){
        Ex_4_1 pizza;
        pizza = new Ex_4_1();
        pizza.radius=10;
        pizza.name ="자바피자";
        double area = pizza.getArea();
        System.out.println(pizza.name+"면적은:"+area);
        Ex_4_1 donut = new Ex_4_1();
        donut.radius= 2;
        donut.name="자바도넛";
        area =donut.getArea();
        System.out.println(donut.name+"면적은"+area);
    }
}
