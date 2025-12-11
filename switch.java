import java.util.Scanner;
/*class cs{
public static void main(String [] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice:");
int ch=sc.nextInt();
System.out.println("Enter number 1:");
int num1=sc.nextInt();
System.out.println("Enter number 2:");
int num2=sc.nextInt();
switch(ch){
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
}
}}*/
import java.util.Scanner;

class bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int balance = sc.nextInt(); 

        System.out.println("Enter your choice:");
        System.out.println("1. Credit Amount");
        System.out.println("2. Debit Amount");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");

        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Enter amount to credit:");
                int credit = sc.nextInt();
                balance += credit;
                System.out.println("Amount credited! Updated Balance: " + balance);
                break;

            case 2:
                System.out.println("Enter amount to debit:");
                int debit = sc.nextInt();
                if (debit > balance) {
                    System.out.println("Insufficient Balance!");
                } else {
                    balance -= debit;
                    System.out.println("Amount debited! Updated Balance: " + balance);
                }
                break;

            case 3:
                System.out.println("Your Current Balance: " + balance);
                break;

            case 4:
                System.out.println("Thank you! Exiting.");
                break;

            default:
                System.out.println("Enter a valid choice!");
        }
    }
}

