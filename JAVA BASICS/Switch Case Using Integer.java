//Switch case using Integer
import java.util.Scanner;
public class main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the month :");
     int  month  = sc.nextInt();
     switch(month){
         case 1:
             System.out.println("31 days");
             break;
        case 2:
             System.out.println("28 days");
             break;
        
             
     }
    }
}
