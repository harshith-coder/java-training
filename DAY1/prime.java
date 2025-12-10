import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt();
        if(n%2==0 || n%3==0 || n%5==0){
            System.out.println("not a prime");
                return;
        }
        for(int i=7;i*i<n;i++){
            if( n%i==0){
                System.out.println("not a prime");
                return;
            }
        }
        System.out.println("its prime");
    }
}
