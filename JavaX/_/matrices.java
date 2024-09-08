import java.util.Scanner;
public class matrices{
    
    static int r=0,c=0,r2=0,c2=0;
    static int [][] m1 =null;
    static int [][] m2=null;
    static int [][] result=null;
    static boolean possible = false;
    static Scanner scan = new Scanner(System.in);
    
    static void inputOrder(){
        char order;
                
        System.out.println("If Matrices are of same order press 'O', else press 'I'. : ");
        order = scan.nextLine().charAt(0);
        if(order == 'O'){
            possible = true;
            System.out.println("What is the order of both the matrices : (value of row--enter--value of column--enter.)");
            r = scan.nextInt();
            c = scan.nextInt();
            r2= r;
            c2 =c;
            
        }else if(order == 'I'){
            System.out.println("What is the order 1st matrix : (value of row--enter--value of column--enter.)");
            r = scan.nextInt();
            c = scan.nextInt();
            
            System.out.println("What is the order 2nd matrix : (value of row--enter--value of column--enter.)");
            r2 = scan.nextInt();
            c2 = scan.nextInt();
            
        }
        if(c != r2){
                System.out.println("Multiplication not possible.");
                possible = false;
            }else{
                System.out.println("Multiplication is possible. The resulting matrix will be of order " + r + "*"
                +c2);
                m1 = new int[r][c];
                m2 = new int[r2][c2];
                possible = true;
            }
    }
    
    static void inputValues(){
        
        for(int i = 0; i < r; i++){
            for(int j =0; j < c;j++){
                System.out.println("Enter the value of Element of row " + i + " column " + j + " of matrix 1 : ");
                int value = scan.nextInt();
                m1[i][j] = value;
             }
        }
            System.out.println();
        for(int i = 0; i < r2; i++){
            for(int j =0; j < c2;j++){
                System.out.println("Enter the value of Element of row " + i + " column " + j + " of matrix 2 : ");
                int value = scan.nextInt();
                m2[i][j] = value;
            }
        }
    
        
    }
    
    static void displayMatrices(){
        
        System.out.println("Matrix 1 : ");
        
        for(int i = 0; i < r; i++){
                for(int j =0; j < c;j++){
                    System.out.print(m1[i][j] + " ");
                }
                System.out.println();
        }
        
        System.out.println("-----------");
        System.out.println("Matrix 2 : ");
        
        for(int i = 0; i < r2; i++){
            for(int j =0; j < c2;j++){
                    System.out.print(m2[i][j] + " ");
                }
                System.out.println();
        }
        
    }
    
   /* void multiplication(){
        
        for(int i = 0;i < r;i++){
            for(int j=0;j < c2;j++)
            {
                
                
                 for(int k = 0; k < r;k++){
                     
                 }
            }
        }
        
    }*/
    
    public static void main (String args[]){
        inputOrder();
        
        if(possible == true){
            inputValues();
            displayMatrices();
        }
        
    } 
}
