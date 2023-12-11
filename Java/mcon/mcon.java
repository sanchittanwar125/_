import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;

public class mcon
{
    public static void main(String args[]) throws java.io.IOException {
        
        String in0 = null;
        Scanner scan = new Scanner(System.in);
        String o;
        
        in0 = scan.nextLine();
        o = in0;
        if(o.equals("Open a app for me")){
            System.out.println("mcon < ok. which app?");
            String whpp = scan.nextLine();
            
            if(whpp.equals("open cmd")){
                openAfile.cmd();
            }else if(whpp.equals("open chrome")){
                openAfile.chrome();
            }else if(whpp.equals("open paint")){
                openAfile.paint();
            }
            else{
            System.out.println("mcon < Sorry. Wrong syntax for me.");
            }
        }else{
            System.out.println("mcon < Sorry. Wrong syntax for me.");
        }
    
    }
}
