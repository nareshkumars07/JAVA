//SORTING IN ASCENDING ORDER
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
        for (int i=0; i<n-1;i++){
            for(int j = i+1;j<n;j++){
                if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                }
            }
        } for (int i=0; i<n;i++){
        System.out.println(arr[i]);
        }
       }
}
