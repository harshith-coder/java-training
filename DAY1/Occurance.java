import java.util.Scanner;

public class Occurance {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt(),count=0,temp=n;
        System.out.print("enter the digit: ");
        int digit=scan.nextInt();
        while(n>0){
            if(n%10==digit) count++;
            n/=10;
        }
        System.out.println("the occurance of "+ digit+ " in "+ temp+" is: "+count);
    }
}
