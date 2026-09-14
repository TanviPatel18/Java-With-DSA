// import java.util.Scanner;

// public class a1 {
//     public static void main(String[] args) {
        
//         Scanner sc=new Scanner(System.in);
//         System.out.print("enter the size of and arr:-");
//         int n=sc.nextInt();
//         int arr[]=new int[n];
//         System.out.println("enter thr array element :-");
//         for(int i=0;i<n;i++)
//         {
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("enter thr number large element to know it is:-");
//         int x=sc.nextInt();
//         int count=0;

//         for(int i=0;i<n;i++)
//         {
//             if(arr[i]>=x)
//             {   
//                 x=arr[i];
//                 count++;
//             }
//         }

//         System.out.println("largest element is: "+x);
//         System.out.println("largest element's count is: "+count);
//     }    
// }


// finding second last element

// import java.util.Scanner;

// public class a1 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();

//         int[] arr = new int[n];

//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         int largest = Integer.MIN_VALUE;
//         int secondLargest = Integer.MIN_VALUE;

//         for (int i = 0; i < n; i++) {

//             if (arr[i] > largest) {
//                 secondLargest = largest;
//                 largest = arr[i];
//             }
//             else if (arr[i] > secondLargest && arr[i] != largest) {
//                 secondLargest = arr[i];
//             }
//         }

//         System.out.println("Largest element is: " + largest);
//         System.out.println("Second largest element is: " + secondLargest);
//     }
// }

import java.util.Scanner;

public class a1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) 
                {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("sorted arr is: "  );
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]+" ");
        }

        // System.out.println("Second largest element is: " + secondLargest);
    }
}