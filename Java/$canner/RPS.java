import java.util.*;
public class RPS{
    public static void main(String[] args){
        System.out.println("*YOU VS COMPUTER*");
        
        String userChoice;
        String compChoice;
        char choice;
        boolean won = false;
        int wins = 0;
        int lose = 0;
        
        Scanner scanner = new Scanner(System.in);
        do{
        System.out.println("******** START *********\nRock Paper Scissors ....");
        userChoice = scanner.next();
        
        Random random = new Random();
        int comp = random.nextInt(3);
        
        if(comp == 0){
            compChoice = "Rock";
        }else if(comp == 1){
            compChoice = "Paper";
        }else{
            compChoice = "Scissors";
        }
        
        System.out.println("Computer Choice : " + compChoice);
        
        if(userChoice.equals("Rock") || userChoice.equals("rock") && compChoice.equals("Rock")){
            System.out.println("It a tie");
        }else if(userChoice.equals("Rock")|| userChoice.equals("rock") && compChoice.equals("Paper")){
            System.out.println("You lose!!");
            won = false;
        }else if(userChoice.equals("Rock")|| userChoice.equals("rock") && compChoice.equals("Scissors")){
            System.out.println("You Won!!");
            won = true;
        }else if(userChoice.equals("Paper")|| userChoice.equals("paper") && compChoice.equals("Rock")){
            System.out.println("You Won!!");
            won = true;
        }else if(userChoice.equals("Paper")|| userChoice.equals("paper") && compChoice.equals("Scissors")){
            System.out.println("You Lose!!");
            won = false;
        }else if(userChoice.equals("Paper")|| userChoice.equals("paper") && compChoice.equals("Paper")){
            System.out.println("Its a tie");
        }else if(userChoice.equals("Scissors")|| userChoice.equals("scissors") && compChoice.equals("Scissors")){
            System.out.println("Its a tie");
        }else if(userChoice.equals("Scissors")|| userChoice.equals("scissors") && compChoice.equals("Paper")){
            System.out.println("You Won!!");
            won = true;
        }else if(userChoice.equals("Scissors")|| userChoice.equals("scissors") && compChoice.equals("Rock")){
            System.out.println("You Lose!!");
            won = false;
        }else{
            System.out.println("-1");
            won = false;
        }
        
        if(won == true){
            wins += 1;
        }else {
            lose += 1;
        }
        
        System.out.println("Score (Win - Lose/tie) : " + wins + "-" + lose);
        
        System.out.println("\nWant to play more (Y/N) : ");
        choice = scanner.next().charAt(0);
        
        if(choice == 'N' || choice == 'n'){
            System.out.println("Bye!\n \t**********THE END***********");
        }
    }while(choice == 'Y' || choice == 'y');
        
    }
}
