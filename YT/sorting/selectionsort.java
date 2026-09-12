import java.util.*;
public class selectionsort {
    public static void main(String[] args) {

        int[] arr = {6, 3, 8, 2, 7, 1, 5, 4};
        int min;
        for(int i = 0; i < arr.length - 1; i++) {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[min]>arr[j])
                    min=j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
