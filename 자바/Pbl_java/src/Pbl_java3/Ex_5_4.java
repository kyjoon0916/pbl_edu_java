package Pbl_java3;
class Person_4{}
class Student_4 extends Person_4{}
class Researcher extends Person_4{}
class professor extends Researcher{}
public class Ex_5_4{
    static void print(Person_4 p){
        if(p instanceof Person_4)
            System.out.print("Person");
        if(p instanceof Person_4)
            System.out.print("Student_4");
        if(p instanceof Person_4)
            System.out.print("Researcher");
        if(p instanceof Person_4)
            System.out.print("Professor");
        System.out.println();
    }
    public void main(String[] args){
        System.out.print("new Student_4() -> \t"); print(new Student_4());
        System.out.print("new Researcher() -> \t"); print(new Researcher());
        System.out.print("new professor() -> \t"); print(new professor());
        
    }   
}
