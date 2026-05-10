import java.util.*;

public class recursion1 {
    // tower of hanoi
    // public static void towerOfHanoi(int n,String src ,String helper,String dest)
    // {
    //     if(n==1)
    //     {
    //         System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //         return;
    //     }
    //     towerOfHanoi(n-1, src, dest,helper);
    //     System.out.println("transfer disk "+n+" from "+src+" to "+dest);
    //     towerOfHanoi(n-1, helper, src, dest);
    // }
    // public static void main(String[] args) {
    //     int n=2;
    //     towerOfHanoi(n,"s","h","d");
    // }


    // find the 1st &last occurance of an element in the string

    // public static int first=-1;
    // public static int last=-1;

    // public static void  printoccur(String str,int idx,char element)
    // {
    //     if(idx==str.length())
    //     {
    //         System.out.println(first);
    //         System.out.println(last);
    //         return;
    //     }
    //     char  currentchar=str.charAt(idx);

    //     if(currentchar == element)
    //     {
    //         if(first==-1)
    //         {
    //             first=idx;
    //         }
    //         else{
    //             last=idx;
    //         }
    //     }
    //     printoccur(str, idx+1, element);
    // }
    // public static void main(String[] args) {
    //     String str="abaacdaefaah";
        
    //     printoccur(str,0,'a');
    // }

    // public static void printperm(String str,String permutation)
    // {
    //     if(str.length()==0)
    //     {
    //         System.out.println(permutation);
    //         return;
    //     }
    //     for (int i=0; i<str.length();i++)
    //     {
    //         char currentchar=str.charAt(i);
    //         //abc-> "ab"
    //         String newStr = str.substring(0, i) + str.substring(i + 1);
    //         printperm(newStr, permutation+currentchar);
            
    //     }
    // }
    // public static void main(String[] args) {
    //     String str="abc";
    //     printperm(str, "");
    // }


    // public static  int countpath(int i, int j,int n, int m)
    // {
    //     if(i==n||j==m)
    //     {
    //         return 0;
    //     }
    //     if(i==n-1&&i==m-1)
    //     {
    //         return 1;
    //     }
    //     //move downwards
    //     int downpaths=countpath(i+1, j, n, m);
        
    //     //move right
    //     int rightpart=countpath(i, j+1 ,n, m);
    //     return downpaths+rightpart;
    // }
    // public static void main(String[] args) {
    //     int n=4,m=4;
    //      int totalpaths=countpath(0, 0, n, m);
    //     System.out.println(totalpaths);
    // }


    // public static int counttiles(int n ,int m)
    // {
    //     if(n<m)
    //     {
    //         return 1;
    //     }
    //     if(n==m)
    //     {
    //         return 2;
    //     }
    //     //vertical
    //     int vertical=counttiles(n-m,m);

    //     int herezontal=counttiles(n-1,m);

    //     return vertical+herezontal;
    // }
    // public static void main(String[] args) {
    //     int n=4,m=2;
    //     int total=counttiles(n, m);
    //     System.out.println("total count= "+total);
    // }

    // public static int callGest(int n)
    // {
    //     if (n<=1)
    //     {
    //         return 1;
    //     }
    //     int way1=callGest(n-1);

    //     int way2=(n-1)*callGest(n-2);

    //     return way1+way2;
    // }
    // public static void main(String[] args) {
    //     int n=4;
    //     int total=callGest(n);
    //     System.out.println(total);
    // }

    public static void printsubset(ArrayList<Integer> subset)
    {
        for(int i=0;i<subset.size();i++)
        {
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }
    public static void findsubset(int n,ArrayList<Integer> subset)
    {
        if(n==0)
        {
            printsubset(subset);
            return;
        }


        //add
        subset.add(n);
        findsubset(n-1, subset);


        //add nahi hoga
        subset.remove(subset.size()-1);
        findsubset( n-1, subset);

    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset =new ArrayList<>();
        findsubset(n, subset);
    }
}
