import java.util.Scanner;

public class fibonnic{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("No. of Fibonacci Series Numbers You Want See : ");
        long x = scan.nextLong();
        
        long a = 0;
        long b = 0;
        long c = 0;
        a = 0;
        b = 1;
        System.out.print("0,1,");
        for(long i = 3; i<=x; i++){
            c = a + b;
            System.out.print(c);
            if(i!=x){
                System.out.print(",");
            }
            a = b;
            b = c;
        }
    }
}