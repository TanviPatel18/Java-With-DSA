import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// public class a2 {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         Scanner sc= new Scanner(System.in);
        
//         System.out.println("enter the number u want to rotete :-");
//         int n=sc.nextInt();
//         for (int k = 0; k < n; k++) {

//             int first = arr[0];

//             for (int i = 0; i < arr.length - 1; i++) {
//                 arr[i] = arr[i + 1];
//             }

//             arr[arr.length - 1] = first;
//         }

//         for (int i = 0; i < arr.length; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }

// swap zero to the end 
// public class a2 {

//     public static int minimumSwaps(int[] nums) {

//         int left = 0;
//         int right = nums.length - 1;
//         int count = 0;

//         while (left < right) {

//             if (nums[left] != 0) {
//                 left++;
//             }
//             else if (nums[right] == 0) {
//                 right--;
//             }
//             else {

//                 int temp = nums[left];
//                 nums[left] = nums[right];
//                 nums[right] = temp;

//                 count++;
//                 left++;
//                 right--;
//             }
//         }

//         return count;
//     }

//     public static void main(String[] args) {

//         int[] nums = {0, 1, 0, 3, 12};

//         int ans = minimumSwaps(nums);

//         System.out.println("Minimum swaps = " + ans);
//     }
// }

//union of 2 sortd array a1+a2;
public class a2
{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3, 5, 6};

        Set<Integer> set = new HashSet<>();

        for (int x : a) {
            set.add(x);
        }

        for (int x : b) {
            set.add(x);
        }

        System.out.println(set);
    
    }
    
}
