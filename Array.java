import java.util.*;
public class Array {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("enter the size of array: ");
        int n= sc1.nextInt();
        int arr[]=new int[n];
        System.out.println("enter the value in array: ");
        for(int i =0;i<arr.length;i++)
        {
            arr[i]=sc1.nextInt();
        }
        for(int i =0;i<arr.length;i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.println("enter the targent number to find the index(index start with 0): ");
        int find=sc1.nextInt();

        for(int i =0 ; i<arr.length;i++)
        {
            if(arr[i]==find)
            {
                System.out.print("number found on:");
                System.out.print(i);
            }
        }
    }
}

