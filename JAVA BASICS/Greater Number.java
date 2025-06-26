//Greater Number
import java.util.Scanner;
public class main{
    public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the value a :");
     int a = sc.nextInt();
      System.out.println("enter the value b :");
      
     int b = sc.nextInt();
      System.out.println("enter the value c :");
     int c =sc.nextInt();
     if(a>=b && a>=c){
     System.out.println("a is greater");
     }else if (b>=a && b>=c){
         System.out.println("b is greater");
         
     }else
     System.out.println("c is greater");
   
    }
}
