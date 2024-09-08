import java.util.Scanner;

public class Main {
    private static int units;
    private static String n;
    private static double bill;

    public void accept(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Name : ");
        n = scan.nextLine();
        System.out.println("Units Consumed : ");
        units = scan.nextInt();
    }

    public void calculate(){
        if(units > 0 && units <= 100){
            bill = units*2.0;
        } else if (units > 100 && units <= 300) {
            bill = 200 + (units-100) * 3.0;
        } else if (units > 300) {
            bill = 200 + 600 + (units-300) * 5.0;
        }
    }

    public void print(){
        System.out.println("Name of the customer : " + n);
        System.out.println("Number of units consumed : " + units);
        System.out.println("Bill amount : " + bill);
    }

    public static void main(String[] args) {
        Main excess = new Main();
        excess.accept();
        excess.calculate();
        excess.print();
    }
}