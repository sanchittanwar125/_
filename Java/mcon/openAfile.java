import java.awt.Desktop;
import java.io.File;
import java.util.Scanner;
public class openAfile
{
    public static void cmd() throws java.io.IOException {
        File file = new File("C:\\Windows\\system32\\cmd.exe");
        Desktop desktop =  Desktop.getDesktop();
        desktop.open(file);
    }
    
    public static void chrome() throws java.io.IOException {
        File file = new File("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe");
        Desktop desktop =  Desktop.getDesktop();
        desktop.open(file);
    }
    
    public static void paint() throws java.io.IOException {
        File file = new File("C:\\Windows\\system32\\mspaint.exe");
        Desktop desktop =  Desktop.getDesktop();
        desktop.open(file);
    }
}