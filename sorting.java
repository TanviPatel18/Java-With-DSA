// import java.util.*;
public class sorting 
{
    public static void print(int arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) 
    {
        int arr[]={7,8,3,1,2};
        
        //bubble sorting....

        /* 
        for(int i=0; i<arr.length;i++)
        {
            for(int j=0; j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp= arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        print(arr);
        */
    
        //selection sort
        /* 
        for(int i=0;i<arr.length;i++)
        {
            int small=i;
            for(int j=i+1; j<arr.length;j++)
            {
                if(arr[small]>arr[j])
                {
                    small=j;
                }
            }
            int temp=arr[small];
            arr[small]=arr[i];
            arr[i]=temp;
        }
        print(arr);
        */

        //insertion sort
        for(int i=1;i<arr.length;i++)
        {
            int current=arr[i];
            int j=i-1;
            while(j>=0&& current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;

        }
        print(arr);


    }
    
}
