import java.util.Scanner;
public class arrangementOfNumbers
{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        char y;
        do{
        System.out.println("Enter 1st Number:");
        int a = scanner.nextInt();
        System.out.println("Enter 2st Number:");
        int b = scanner.nextInt();
        System.out.println("Enter 3st Number:");
        int c = scanner.nextInt();
        //                                   a = 111, b = 211, c = 221
        int max = (a > b) ? (a > c ? a : c) : (b > c ? b : c);
        int sec = (a > b) ? (a > c ? (b > c ? b : c) : a) : (b > c ? (a > b ? a : c) : b);
        int min = (a > b) ? (a > c ? (b > c ? c : b) : b) : (b > c ? (a > c ? c : a) : a);
        
        
        
        System.out.println("Press d for descending order or press a for ascending order");
        char choice = scanner.next().charAt(0);
        
        if(choice == 'd'){
        System.out.println("Descending Order : " + max + "," + sec + "," + min);            
        }else if(choice == 'a'){
        System.out.println("Ascending Order : " + min + "," + sec + "," + max);                        
        }else{
        System.out.println("Wrong option. try again");            
        }
        
        System.out.println("Continue (Y/N) : ");
        y = scanner.next().charAt(0);
        
    }while(y == 'y' || y == 'Y');
        
        

    }
}
