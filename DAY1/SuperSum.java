import java.util.Scanner;

public class SuperSum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enetr a number: ");
        int n=scan.nextInt();
        int res=n%9;
        if(res==0) System.out.println("super sum: "+9);
        else System.out.println("super sum: "+res);
    }
}
