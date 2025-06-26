// TYPE CASTING (EXPLICIT)
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number value ");
        double a = input.nextDouble();
        float b = (float)a;
        System.out.println(b);
    }
}
