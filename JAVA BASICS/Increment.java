//increment
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("value a :");
        int a = sc.nextInt();
        int b=++a-a++;
        System.out.println(b);
    }
}
