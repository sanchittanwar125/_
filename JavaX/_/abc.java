import java.util.*;

public class abc{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int k, alpha, xl;
        
        System.out.println("Enter a Sentence : ");
        String x = scan.nextLine();
        
        Random random = new Random();
        
         alpha = random.nextInt(65,96);
        System.out.println("Today , we'll find the Alphabet : " + (char)alpha);
        
         xl = x.length();
         k = 0;
        for(int i =0; i < xl; i++){
             x=x.toUpperCase();
            if(alpha == (int)x.charAt(i) ){
                k++;
            }
        }
        
        System.out.println("By the computer's brain there are " + k + " " + (char)alpha + " in the sentence");
    
    }
}