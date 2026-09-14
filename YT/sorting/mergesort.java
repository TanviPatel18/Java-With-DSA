import java.util.*;
public class mergesort {
    static  void mergecode(int[] arr,int low,int high)
    {
        if(low>=high)
            return;

        int mid=(low+high)/2;

        mergecode(arr, low, mid);

        mergecode(arr, mid+1, high);
        merge(arr,low,mid,high);
    }
    static void merge(int[] arr,int low,int mid,int high)
    {
        ArrayList<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high)
        {
            if(arr[left]<=arr[right])
            {
                list.add(arr[left]);
                left++;
            }
            else{
                list.add(arr[right]);
                right++;
            }
        }
        while(right<=high)
        {
            list.add(arr[right]);
            right++;
        }

        while(left<=high)
        {
            list.add(arr[left]);
            left++;
        }

        for(int i=low;i<=high;i++)
        {
            arr[i]=list.get(i-low);
        }

    }
    public static void main(String[] args) {
        int[] arr = {6, 3, 8, 2, 7, 1, 5, 4};

        mergecode(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }
}
