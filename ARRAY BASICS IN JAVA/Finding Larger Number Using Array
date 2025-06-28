//FINDING LARGER NUMBER USING ARRAY
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number Of Elements : ");
        int n = input.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the "+n+" Elements");
        for(int i = 0; i<n;i++){
            arr[i] = input.nextInt();
        }
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
            System.out.println("Largest Element : "+max);
    }
}
