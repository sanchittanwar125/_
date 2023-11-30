import java.util.Scanner;
public class ReportCard{
    public static void main(String[] args){
         
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Student Name : ");
         String name = scanner.nextLine();
         
         System.out.print("Class : ");
         int classs = scanner.nextInt();
         
         System.out.print("Section : ");
         char sec = scanner.next().charAt(0);
         
         System.out.print("Maximum Marks : ");
         int mm = scanner.nextInt();
         
         System.out.print("NO. of Subject : ");
         int NOS = scanner.nextInt();
         
         System.out.println("Marks of Subjects : ");
         int tmarks = 0;
         for (int i = 1; i <= NOS; i++) {
            System.out.print(i+") ");
            int marks = scanner.nextInt();
            tmarks += marks;
        } 
        int d = mm*NOS;
        float tp = (tmarks * 100/ d);
        System.out.println("\n*REPORT CARD* \n \n" + "Name : "+name + "\t \t " + "Class : "+classs + " " + sec +
        "\n \n" + "Total marks : " + tmarks + "/"+ mm*NOS +"\n" + "Total Percentage : " + tp);
         
        scanner.close();
    }
     
}