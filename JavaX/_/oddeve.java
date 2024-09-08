import java.util.Scanner;
import java.util.Random;

public class oddeve{
    
    static Scanner scan = new Scanner(System.in);
    static String odddevee;
    public static void main(String args[]){
        
        char choice;
        do{
        System.out.println("Multiplayer (M) or Computer (C) (S for stop)");
        choice = scan.nextLine().charAt(0);
        
         if(choice == 'C'){
             System.out.println("ODD (O) or EVEN (E) : ");       // Player choice
             odddevee = scan.nextLine();
             computers bot = new computers();
             bot.computer();
         }
        }while(choice != 'S');
    }
}