import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt();
        int sum=0;
        for(int i=1;i<=n/2;i++) if(n%i==0) sum+=i;
        if(n==sum) System.out.println("its a perfect number");
        else if(sum>n) System.out.println("its a abudend number");
        else System.out.println("its a deficent number");
    }
}
