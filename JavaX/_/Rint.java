public class Rint{
    public static void main(String args[]){
        double k = 21;
        double x = 21;
        for(int i=0;i<9;i++){
            System.out.println("'Math.rint' for " + k/10 + " : " + Math.rint(k/10));
            k += 1;
        }
        
        for(int j=0;j<9;j++){
            System.out.println("'Math.round' for " + x/10 + " : " + Math.round(x/10));
            x += 1;
        }
    }
}