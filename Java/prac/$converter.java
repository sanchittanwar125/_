import java.util.Scanner;
public class $converter
{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        
        System.out.println("USD to INR");
        
        System.out.println("USD : ");
        int usd = scan.nextInt();
        
        System.out.println("$" + usd + " = " + " ₹" + usd * 83.37);
        
    }
}
