import java.util.*;
public class usernameCreator{
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        
        char fname;
        char lname;
        
        System.out.print("First Name : ");
        fname = scanner.nextLine().charAt(0);
        System.out.print("Last Name : ");
        lname = scanner.nextLine().charAt(0);
        
        Random random = new Random();
        int x = random.nextInt(10000)+1;
        
        System.out.println (fname + "" + lname + "_"+x);
    }
}