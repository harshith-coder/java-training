import java.util.Scanner;


public class PrimesInRange {  
    public static void isPrime(int n){
        if(n==2 || n==3 || n==5) {
            System.out.println(n+" ");
            return;
        }
        if(n%2==0 || n%3==0 || n%5==0){
                return;
        }
        for(int i=7;i*i<n;i++){
            if( n%i==0){
                return;
            }
        }
        System.out.println(n+" ");
}
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt();
        for(int i=2;i<n;i++) isPrime(i);
    }
}
