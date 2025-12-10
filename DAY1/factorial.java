
import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt();
        long fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        System.out.println("factorial of "+n+" is: "+fact);
    }
}
