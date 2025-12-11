 public class basic1 {
public static void main(String[] args) {
    //System.out.println("Hello, World!");
    //swapping two numbers
    int a,b,c;
    a=10;
    b=20;
    System.out.println("Before swapping a="+a+"b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping a="+a+"b="+b);
}
}