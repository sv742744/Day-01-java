import java.util.*;
class strings {
    public static void main (String args []){
        Scanner sc =new Scanner (System.in);
        int c=20;
        System.out.printf("congratulation you won %d",c);// suing or accepting int 
        String a=sc.next();
        String b=String.format("congratulatoin %s you won 5 lakhs",a);// sir method
        System.out.println(b);
        System.out.println("congratulatoin "+a+"   you won 10 lakhs");//normal method
        System.out.printf("congratulation %s  you won 15 lakhs",a);// own method
    


    }
}