import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[][] board = new int[3][3];

        int i = 1;
        do {
            System.out.println("On Which Block (Rows & Column): ");
            int r = scan.nextInt();
            int c = scan.nextInt();

            System.out.println("Enter a number : ");
            int x = scan.nextInt();

            board[r][c] = x;
            i++;
        }while (i <= 9);

        System.out.println( board[0][0] + " " + board[0][1] + " " + board[0][2] + " \n" +
                            board[1][0] + " " + board[1][1] + " " + board[1][2] + " \n" +
                            board[2][0] + " " + board[2][1] + " " + board[2][2] + " \n" );
    }
}