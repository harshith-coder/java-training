import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt(),newnum=0,temp=n;
        while(n>0){
            newnum=(newnum*10)+n%10;
            n/=10;
        }
        System.out.println("the reverse of "+temp+" is: "+newnum);
    }
}
