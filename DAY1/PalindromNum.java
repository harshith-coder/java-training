import java.util.Scanner;

public class PalindromNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt(),temp=n,newnum=0;
        while(n>0){
            newnum=(newnum*10)+n%10;
            n/=10;
        }
        if(newnum==temp) System.out.println("it is a palindrom");
        else System.out.println("it is not a palindrom");

    }
}
