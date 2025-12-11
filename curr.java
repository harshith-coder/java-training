//leetcode question
import java.util.Scanner;
class q1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       System.out.println("enter the amt:");
        int amt = sc.nextInt();

        int n2000=0, n500=0, n200=0, n100=0, n50=0, n20=0, n10=0, n5=0, n2=0, n1=0;

        if(amt >= 2000){
            n2000 = amt / 2000;
            amt = amt % 2000;
            System.out.println("2000 rs notes: " + n2000);
        }
        if(amt >= 500){
            n500 = amt / 500;
            amt = amt % 500;
            System.out.println("500 rs notes: " + n500);
        }
        if(amt >= 200){
            n200 = amt / 200;
            amt = amt % 200;
            System.out.println("200 rs notes: " + n200);
        }
        if(amt >= 100){
            n100 = amt / 100;
            amt = amt % 100;
            System.out.println("100 rs notes: " + n100);
        }
        if(amt >= 50){
            n50 = amt / 50;
            amt = amt % 50;
            System.out.println("50 rs notes: " + n50);
        }
        if(amt >= 20){
            n20 = amt / 20;
            amt = amt % 20;
            System.out.println("20 rs notes: " + n20);
        }
        if(amt >= 10){
            n10 = amt / 10;
            amt = amt % 10;
            System.out.println("10 rs notes: " + n10);
        }
        if(amt >= 5){
            n5 = amt / 5;
            amt = amt % 5;
            System.out.println("5 rs notes: " + n5);
        }
        if(amt >= 2){
            n2 = amt / 2;
            amt = amt % 2;
            System.out.println("2 rs notes: " + n2);
        }
        if(amt >= 1){
            n1 = amt / 1;
            amt = amt % 1;
            System.out.println("1 rs notes: " + n1);
        }

        int total = n2000 + n500 + n200 + n100 + n50 + n20 + n10 + n5 + n2 + n1;

        System.out.println("Total number of notes: " + total);
    }
}
//import java.util.Scanner;

/*class eb{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.of units:");
        
        int unit = sc.nextInt();
        double amt1 = 0;

        if(unit >= 1 && unit <= 100){
            amt1 = unit * 6;
            System.out.println("The amount is: " + amt1);
        }
        else if(unit >= 101 && unit <= 200){
            amt1 = (100 * 6) + ((unit - 100) * 8);
            System.out.println("The amount is: " + amt1);
        }
        else if(unit >= 201 && unit <= 300){
            amt1 = (100 * 6) + (100 * 8) + ((unit - 200) * 10);
            System.out.println("The amount is: " + amt1);
        }
        else if(unit >= 301 && unit <= 400){
            amt1 = (100 * 6) + (100 * 8) + (100 * 10) + ((unit - 300) * 12);
            System.out.println("The amount is: " + amt1);
        }
        else if(unit > 400){
            amt1 = (100 * 6) + (100 * 8) + (100 * 10) + (100 * 12) + ((unit - 400) * 14.5);
            System.out.println("The amount is: " + amt1);
        }
        else{
            System.out.println("Invalid units");
        }
    }
}
class loop{
    public static void main(String [] args){
    /*int n=10;
    for(int i=1;i<=n;i++){
    System.out.println("Hello !"+i);*/
 //wap to print even no.s between 1-20
 int num = 20;
for(int i = 1; i <= num; i++){
    if(i % 2 == 0){
        System.out.println("Even numbers are: " + i);
    }
}
// fact of a num
int n,fact=1;
Scanner sc = new Scanner(System.in);
System.out.print("enter a num:");
n=sc.nextInt();
for(int i=1;i<=n;i++){
fact*=i;
}
System.out.println("The factorial of num is:"+fact);
//mul table
System.out.print("enter a num1:");
num=sc.nextInt();
for(int i=1;i<=10;i++){
System.out.println(num+"*"+i+"="+num*i);
}
// num div by 2&3
int num1;
System.out.print("enter a num2:");
num1=sc.nextInt();
for(int i=1;i<=50;i++){
if(i%6==0){
System.out.println(i);
}}
}}
//first 25 telugu alphabets
class tq {
    public static void main(String[] args) {
        int start = 3077;

        for(int i = 0; i < 25; i++) {
            char letter = (char)(start + i);
            System.out.println(letter);
        }
    }
}
// print 2 digits after decimal
class dd{
public static void main(String [] args){
System.out.println("Enter a number:");
 double num=sc.nextDouble();
System.out.printf(".%2f"+num);
}}
class ut {
    public static void main(String[] args) {

        System.out.println("   /\\   ");
        System.out.println("  /--\\  ");
        System.out.println(" /----\\ ");
        System.out.println("/------\\");   // Roof

        System.out.println("|      |");
        System.out.println("|      |");
        System.out.println("|------|");   // Base
    }
}*/
//wap to display ascii values of all character
//wap to swap two numbers using bitwise operators
// wap to find the value of 2 pow n using bitwise operators
//wap to check leap year or not using ternary operator
// switch case
class cs{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:");
int ch=sc.nextInt();
int num1=sc.nextInt();
int num2=sc.nextInt();
switch(ch):
case 1:
	System.out.println("Add of two numbers:"+(num1+num2));
	break;
case 2:
	System.out.println("Sub of two numbers:"+(num1-num2));
	break;
case 3:
	System.out.println("Product of two numbers:"+(num1*num2));
	break;
case 4:
	System.out.println("Division of two numbers:"+(num1/num2));
	break;
default:
	System.out.println("enter a valid choice!");
}}







        
        
        


