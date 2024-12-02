import java.io.PrintWriter;
public class p{
    public static void main(String args []){
        PrintWriter pw = new PrintWriter(System.out);
        pw.println("hello world");
        pw.print("this is a ");
        pw.print(" statement");
        pw.close();
    }
}