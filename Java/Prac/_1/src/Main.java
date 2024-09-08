import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Number of Digits : ");
        int n = scan.nextInt();

        int[] number = new int[n];

        System.out.println("Enter a Number (" + n + " digits number) : ");

        int x_rev = scan.nextInt();
        int d, i = n-1;
        while(x_rev != 0){
            d = x_rev % 10;
            x_rev /= 10;
            number[i] = d;
            i--;
        }

        Arrays.sort(number);
        System.out.println(Arrays.toString(number));

        int ascendingOrder = 0;
        for (int j : number) {
            ascendingOrder = ascendingOrder * 10 + j;
        }
        System.out.println("Smallest Possible Number From the Given Number's Digit : " + ascendingOrder);


        int d_D, d_R = 0;
        while (0 != ascendingOrder) {
            d_D = ascendingOrder % 10;
            d_R = d_R * 10 + d_D;
            ascendingOrder /= 10;
        }
        System.out.println("Greatest Possible Number From the Given Number's Digit : " + d_R);
    }
}