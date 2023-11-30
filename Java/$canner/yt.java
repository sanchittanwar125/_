
import java.util.*;
public class yt
{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("NO. of Subject : ");
         int NOS = scanner.nextInt();
        int u = 0;
        int tmarks = 0;
        for (int i = 1; i <= NOS; i++) {
            System.out.println("Marks: ");
            int marks = scanner.nextInt();
             //if(marks<=100){
                 tmarks += marks;
                 System.out.println(tmarks);
                 
             //}else{
                 //System.out.println("Not possible");
             //}
        } 
        System.out.println(tmarks);
        /*boolean stop;
        if(u == NOS){stop = true;}else{stop = false;}
        do{
             
             System.out.println("Marks: ");
            // int marks = scanner.nextInt();
             /*if(marks<=100){
                 marks += tmarks;
                 
             }else{
                 System.out.println("Not possible");
             }
             
            }while(!stop);*/
    }
}
