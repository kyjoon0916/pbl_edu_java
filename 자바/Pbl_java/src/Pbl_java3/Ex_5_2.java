package Pbl_java3;
class Person{
    private int weight;
    int age;
    protected int height;
    public String name;

    public void setWeight(int wegiht)
    {
        this.weight = weight;
    }
    public int getWeight(){
        return weight=weight;
    }
}
class Student extends Person{
    public void set(){
        age = 30;
        name = "홍길동";
        height = 175;
        // weight = 99;
        setWeight(99);
    }
}
public class Ex_5_2 {
    public static void main(String[] args){
        Student s = new Student();
        s.set();
        
    }
}
