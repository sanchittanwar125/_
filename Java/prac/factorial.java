import java.util.Scanner;

public class factorial{
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Factorial of : ");
        int x = scan.nextInt();
        
        int xc = x;
        int a = x;
        
        while(x!=1){
            x--;
            a *= x;
        }
        
        System.out.println("Factorial of " + xc + " is " + a);
    }
}