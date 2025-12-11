import java.util.Scanner;
class loops{
public static void main(String [] args){
/*int a=10;
if(a>=18){
System.out.println("Eligible for voting");
}else{
System.out.println("Not Eligible for voting");
}*/
Scanner sc=new Scanner(System.in);
System.out.print("Enter a number:");
int num=sc.nextInt();
if(num>0){
System.out.println("Positive number");
}else if(num<0){
System.out.println("Negative number");
}
else{
System.out.println(" Number is Zero");
}
System.out.println("Enter a number 1:");
int num1=sc.nextInt();
if(num1%2==0){
System.out.println("Even number");
}else{
System.out.println("Odd number");
}
//largest of two numbers
System.out.println("Enter a value:");
int a=sc.nextInt();
System.out.println("Enter b value:");
int b=sc.nextInt();
if(a>b){
System.out.println(a+"is the largest number");
}else if (b>a){
System.out.println(b+"is the largest number");
}else{
System.out.println("Both numbers are same");
}
System.out.println("Enter a number 2:");
int num2=sc.nextInt();
if(num2%5==0 && num2%11==0){
System.out.println("Number is divisible by both 5 and 11");
}
else{
System.out.println("not divisible by both numbers");
}
System.out.println("Enter p1 value:");
int p1=sc.nextInt();
System.out.println("Enter p2 value:");
int p2=sc.nextInt();
System.out.println("Enter p3 value:");
int p3=sc.nextInt();
int tp=p1+p2+p3;
if(tp<500){
System.out.println("you got 10 % discount");
int dis=(tp*10)/100;
System.out.println("the discount amt is"+dis);
int fp=tp-dis;
System.out.println("the final amt is"+fp);
}
else if(tp>=500){
System.out.println("you got 30 % discount");
int dis1=(tp*30)/100;
System.out.println("the discount given is"+dis1);
int fp=tp-dis1;
System.out.println("the final amt is"+fp);
}
else{
System.out.println("No discount");
}
//salary assignment 
double hra=0,da=0;
System.out.println("enter basic salary");
int sal=sc.nextInt();
if (sal<=10000){
 hra=(sal*40)/100.0;
da =(sal*9)/100.0;
}
else if (sal>=10000){
hra=(sal*30)/100.0;
da=(sal*11)/100.0;
}
else{
System.out.println("check the salary");
}
double gs=sal+hra+da;
System.out.println("the gross salary is"+gs);
}}