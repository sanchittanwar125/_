import java.util.Scanner;

public class votingSystem
{
    int noOfcand;
    String[] candidates;
    Scanner scan = new Scanner(System.in);
    void noOfcand(){
        System.out.println("Number of Candidates : ");
        noOfcand = scan.nextInt();
    }
    
    void nameOfcand(){
        for(int i = 0; i < noOfcand; i++){
            System.out.println("Candidate " + i + " : ");
            String nameOfcand_Loop_String = scan.nextLine();
            candidates[i] = nameOfcand_Loop_String;
        }
    }
    
    void toVoteguide(){
        for(int i = 0; i < noOfcand; i++){
            System.out.println("To vote for " + candidates[i] + " press " + i);
        }
    }
   public static void main(String args[]){
       votingSystem access = new votingSystem();
       access.noOfcand();
       access.candidates = new String[access.noOfcand];
       access.nameOfcand();
       access.toVoteguide();
       
   }
}
