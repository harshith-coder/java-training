import java.util.Scanner;
class first{
public static void main(String[] args) 
{
    //System.out.println("Hello, World!");
    //swapping two numbers
   /* int a,b,c;
    a=10;
    b=20;
    System.out.println("Before swapping a="+a+"b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("After swapping a="+a+"b="+b);*/
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter b value:");
int b=sc.nextInt();  
 System.out.println("sum of a,b="+(a+b));
System.out.println("sub of a,b="+(a-b));
System.out.println("Mul of a,b="+(a*b));
System.out.println("Mod of a,b="+(a%b));
System.out.println(" a Power b=" + Math.pow(a, b));
System.out.println(" assign +add a,b="+(a+=b));
System.out.println(" assign -sub a,b="+(a-=b));
System.out.println(" assign * mul a,b="+(a*=b));
System.out.println(" assign / div a,b="+(a/=b));
//System.out.println(" assign +add a,b="+(a+=b));
System.out.println(" equals a,b="+(a==b));
System.out.println(" not equals a,b="+(a!=b));
System.out.println("greater a,b="+(a>b));
System.out.println("smaller a,b="+(a<b));
System.out.println("less equals a,b="+(a<=b));
System.out.println("greater equals a,b="+(a>=b));
System.out.println("greater equals a,b="+(a>=b));
System.out.println("greater equals a,b="+(a<<b));
System.out.println("greater equals a,b="+(a>>b));
System.out.println("greater equals a,b="+(~a));
System.out.println("greater equals a,b="+(a&b));
System.out.println("greater equals a,b="+(a|b));
System.out.println("greater equals a,b="+(a^b));
System.out.println("greater equals a,b="+(10<<2));
System.out.println("greater equals a,b="+(5<<2));
System.out.println("greater equals a,b="+(9<<1));
/*boolean a1=true;
boolean b1=false;
System.out.println("smaller a,b="+(a1&&b1));
System.out.println("smaller a,b="+(a1||b1));
//System.out.println("smaller a,b="+(~a1));
//System.out.println("smaller a,b="+(a1<b1));*/
}
}
