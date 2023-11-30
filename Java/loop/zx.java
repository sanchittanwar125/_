import java.util.Scanner;
public class zx
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){ 
        char cr;
        do{
            shmk(); 
            System.out.println("Want to get more shapes ? (Y/N) : ");
            cr = scan.nextLine().charAt(0); 
        }while(cr == 'y' || cr == 'Y');
    }
    
    public static void shmk(){
        System.out.println("What shape do you want ?");
        String sh = scan.nextLine();
        if(sh.equals("Triangle")){
            triangle();
        }else if (sh.equals("Rectangle")){
            rectangle();
        }else if (sh.equals("Sqaure")){
            square();
        }
    }
    
    public static void triangle(){
        for (int i = 1; i <= 5; i++) { 
            for (int j = 1; j <= i; j++) { 
                System.out.print(" 🔺 "); 
            } 
            System.out.println(); 
        } 
    }
    
    public static void rectangle(){
        for (int i = 1; i <= 5; i++) { 
            
            for(int j = 1; j <= 10; j++){
                System.out.print(" 📦 ");
            }
            System.out.println(); 
        } 
    }
    
    public static void square(){
        for (int i = 1; i <= 5; i++) { 
            
            for(int j = 1; j <= 5; j++){
                System.out.print(" ⬛ ");
            }
            System.out.println(); 
        } 
    }
    
}
