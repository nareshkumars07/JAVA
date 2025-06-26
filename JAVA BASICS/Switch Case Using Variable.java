//switch case using variable

import java.util.Scanner;
public class main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the month :");
     String month = sc.next();
     switch(month){
         case "jan":
             System.out.println("31 days");
             break;
        case "feb":
             System.out.println("28 days");
             break;
        
             
     }
    }
}
