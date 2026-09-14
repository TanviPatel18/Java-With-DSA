import java.util.Scanner;

public class a2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        Scanner sc= new Scanner(System.in);
        
        System.out.println("enter the number u want to rotete :-");
        int n=sc.nextInt();
        for (int k = 0; k < n; k++) {

            int first = arr[0];

            for (int i = 0; i < arr.length - 1; i++) {
                arr[i] = arr[i + 1];
            }

            arr[arr.length - 1] = first;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
