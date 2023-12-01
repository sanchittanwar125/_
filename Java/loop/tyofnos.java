import java.util.Scanner;
public class tyofnos{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        char cr;
        long n ,x , x1 , nt, nt1, nt2, cksu = 0 , p = 1;
        double asn = 0, asn1 = 0;
        System.out.print("Enter the number : ");
        n = scanner.nextLong();
        
         x = 0;
         nt = n;
         nt1 = n;
         nt2 = n;
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
        
        // perfect number
    
        for(int i = 1; i <= nt2 / 2; i++){
            if(nt2 % i == 0){
                cksu += i;
            }
        }
        
        // logic for declaration
        
        if (x == n && asn1 == n && cksu == n){
            isPolindrome(); isArmstrong(); isPerfect();
            System.out.println("Unreal!");
        }else if (x == n && asn1 != n && cksu != nt2){
            isPolindrome();
        }else if (x != n && asn1 == n && cksu != nt2){
            isArmstrong();
        }else if (x != n && asn1 != n && cksu == nt2){
            isPerfect();
        }else {
            System.out.println(n + " is just a normal number");
        }
    }
    
    public static void isPolindrome(){
        System.out.println("This is a Polindorme number.");
    }
    public static void isArmstrong(){
        System.out.println("This is a Armstrong number.");
    }
    public static void isPerfect(){
        System.out.println("This is a Perfect number.");
    }
}