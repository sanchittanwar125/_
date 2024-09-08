import java.util.Random;
import java.util.Scanner;

public class computers
{
    static Scanner scan = new Scanner(System.in);
    static String oddoreve;
    static boolean tossWon = false;
    static int borb;   
    static boolean playerBat = false;
    static Random random = new Random();
    static boolean won = false;
    static int w = 0;
    static int l = 0;
    
    computers(){
        oddoreve = null;
        tossWon = false;
        borb = 0;
        playerBat = false;
        won = false;
    }
    
    static void computer(){
        oddeve main = new oddeve();
        oddoreve = main.odddevee;
        
        System.out.println("Ok,... enter the number(1-6)....");
        int Ptoss = scan.nextInt();
        
        int Btoss = random.nextInt(1,7);            // Bot's choice
        System.out.println("Bot's number : " + Btoss);
        
        if((Ptoss + Btoss) % 2 == 0){
            if(oddoreve.equals("E")){
                tossWon = true;
            }else if(oddoreve.equals("O")){
                tossWon = false;
            }
        }else{
            if(oddoreve.equals("O")){
                tossWon = true;
            }else if(oddoreve.equals("E")){
                tossWon = false;
            }
        }
        
        if(tossWon){
            System.out.println("You won the toss... Bat(1) or bowl(0) ");
            borb = scan.nextInt();
            if(borb == 1){
                playerBat = true;
            }else{
                playerBat = false;
            }
        }else{
            borb = random.nextInt(0,2);
            if(borb == 1){
                System.out.println("Bot won the toss... chooses to bat first ");
                playerBat = false;
            }else{
                System.out.println("Bot won the toss... chooses to bowl first ");
                playerBat = true;
            }
            
        }
        
        if(playerBat){
            System.out.println("You're Batting");
            playerBat();
            
        }else{
            System.out.println("You're Bowling");
            playerBowl();
        }
        
        if(won){
            System.out.println("You Won!!");
        }else{
            System.out.println("Bot Won ...Better Luck next Time!!");
        }
        
        score();
        System.out.println("Score is (You - Bot) : " + w + " - " + l);
    }
    
    static void playerBat(){
        int runs =0;
        int target =0;
        boolean out = false;
        do{
        System.out.println("Enter number(1-6) : ");
        int no = scan.nextInt(7);
        
        int bot_no = random.nextInt(1,7);
        System.out.println("Bot's number : " + bot_no);
        
        if(no != bot_no){
            runs += no;
            }else{
               out = true; 
            }
        }while(out == false);
        target = runs +1;
        System.out.println("You're out.. Target for bot is " + target);
        runs = 0;
        out=false;
        do{
        System.out.println("Enter number(1-6) : ");
        int no = scan.nextInt(7);
        
        int bot_no = random.nextInt(1,7);
        System.out.println("Bot's number : " + bot_no);
        
        if(no != bot_no){
            runs += bot_no;
            }else if(no == bot_no){
                out= true;
                System.out.println("Bot score : " + runs);
            }
            
            if(runs >= target){
               out = true; 
            }
        }while(out == false);
        
        if(runs < target){
            won = true;
        }else if(runs == target-1){
            System.out.println("Match Tied!");
        }else{
            won = false;
        }
        
        
    }
    
    static void playerBowl(){
        int runs =0;
        int target =0;
        boolean out = false;
        do{
        System.out.println("Enter number(1-6) : ");
        int no = scan.nextInt();
        
        int bot_no = random.nextInt(1,7);
        System.out.println("Bot's number : " + bot_no);
        
        if(no != bot_no){
            runs += bot_no;
            }else{
               out = true; 
            }
        }while(out == false);
        target = runs +1;
        System.out.println("Bot is out.. Target for YOU is " + target);
        runs = 0;
        out=false;
        do{
        System.out.println("Enter number(1-6) : ");
        int no = scan.nextInt();
        
        int bot_no = random.nextInt(1,7);
        System.out.println("Bot's number : " + bot_no);
        
        if(no != bot_no){
            runs += no;
            }else if(no == bot_no){
                out= true;
                System.out.println("You're score : " + runs);
            }
            
            if(runs >= target){
               out = true; 
            }
        }while(out == false);
        
        if(runs < target){
            won = false;
        }else if(runs == target-1){
            System.out.println("Match Tied!");
        }else{
            won = true;;
        }
    }
    
    static void score(){
        if(won){
            w++;
        }else{
            l++;
        }
    }
}
