import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt(),temp=n,sum=0;
        while(n>0){
            sum+=n%10;
            n/=10;
        }
        System.out.println("sum of digits of "+temp+" is: "+sum);
    }
}
