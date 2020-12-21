package Pbl_java2;

public class Test {
    public static void main(String[] args){
    int intArray[] = new int [5];
    int myArray[] = intArray;

    intArray[1] =2;
    myArray[1] = 6;
    System.out.println(myArray[1]);
    System.out.println(intArray[1]);
        
    }
}
