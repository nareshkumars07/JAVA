//Sum of Even Numbers
public class SumEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;

        
        for (int i = 2; i <= 100; i++) {
            if(i%2==0)
            sum += i; 
        }

        System.out.println("The sum of even numbers between 0 and 100 is: " + sum);
    }
}
