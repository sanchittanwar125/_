import java.util.*;

public class abc_replace{
    
    
    
    public static void main(String args[]){
        String x;
        char c;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter a Sentence : ");
        x = scan.nextLine();
        
        System.out.println("Do you want to chage any alphabet ? (Y/N)");
        c = scan.nextLine().charAt(0);
        
        if(c == 'N'){
            System.out.println("nice.");
        }else{
            System.out.println("Which alphabet you want to replace? ");
            char r = scan.nextLine().charAt(0);
            
            System.out.println("By Which alphabet you want to replace it? ");
            char rAlpha = scan.nextLine().charAt(0);
            
            System.out.println(x.replace(r,rAlpha));
        }   
    }
}