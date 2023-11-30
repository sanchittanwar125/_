import java.util.Scanner;
public class tyofnos{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char cr;
        int n ,x, nt, nt1, x1;
        double asn = 0, asn1 = 0;
        System.out.println("Enter the number : ");
         n = scanner.nextInt();
        
         x = 0;
         nt = n;
         nt1 = n;
         
        // reversing the digits        
        while(nt!=0){
            
            x = x*10 + nt%10;
            nt = nt/10;   
        }
        
        // armstrong number
        
        while(nt1!=0){
            
            x1 =  nt1%10;
            asn =  Math.pow(x1,3);
            asn1 += asn;
            nt1 = nt1/10;   
        }
        
        // logic for declaration
        
        if (x == n && asn1 == n){
                System.out.println(n + " is a palindrome number as well as armstrong number.");
        }else if (x == n && asn1 != n){
            System.out.println(n + " is a palindrome number only.");
        }else if (x != n && asn1 == n){
            System.out.println(n + " is a armstrong number only.");
        }else {
            System.out.println(n + " is just a normal number");
        }
        
    
    }
}