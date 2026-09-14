
import java.util.Scanner;
public class recurtion {
    public static void f(int i,int n)
    {
        if(i>n)
        {
          return;
        }
        System.out.print(i);
        f(i+1,n);
        
        
    }    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
   
        f(1,n);
    }
}



//problem 1

// public class recurtion {
//     public static void f(int n)
//     {
//         if(n==0)
//         {
//             return;
//         }
//         System.out.println("tanvi");
//         f(n-1);
//     }    
//     public static void main(String[] args)
//     {
//         f(5);
//     }
// }


//problem 2: 1->n


// public class recurtion {
//     public static void f(int i,int n)
//     {
//         if(i>n)
//         {
//           return;
//         }
//         System.out.println(i);
//         f(i+1,n);
        
        
//     }    
//     public static void main(String[] args)
//     {
//         f(1,5);
//     }
// }

// // /problem 3: n->1


// public class recurtion {
//     public static void f(int i,int n)
//     {
//         if(i<n)
//         {
//           return;
//         }
//         System.out.println(i);
//         f(i-1,n);
//     }    
//     public static void main(String[] args)
//     {
//         f(5,1);
//     }
// }

// // problem 4: backtraking 1->n
// public class recurtion {
//     public static void f(int i,int n)
//     {
//         if(i<1)
//         {
//           return;
//         }
//          f(i-1,n);
//         System.out.println(i);
//     }    
//     public static void main(String[] args)
//     {
//         f(5,5);
//     }
// }

// problem 5: backtraking n->1
// public class recurtion {
//     public static void f(int i,int n)
//     {
//         if(i>n)
//         {
//           return;
//         }
//         f(i+1,n);
//         System.out.println(i);
//     }    
//     public static void main(String[] args)
//     {
//         f(1,5);
//     }
// }

//  problem 6: parameteried

// public class recurtion {
//     public static void f(int n,int sum)
//     {
//         if(n<1)
//         {
//             System.out.println(sum);
//           return;
//         }
//         f(n-1,sum+n);
//         // System.out.println(i);
//     }    
//     public static void main(String[] args)
//     {
//         f(10,0);
//     }
// }


//  problem 7: Functional Recursion

// public class recurtion {

//     static int factorial(int n) 
//     {
//         if (n == 0) {
//             return 1;
//         }
//         return n * factorial(n - 1);
//     }
//     public static void main(String[] args) {
//         System.out.println(factorial(5));
//     }
// }

//   problem 8: Functional Recursion(reverse on array)

// public class recurtion {

//     static void f(int n[],int i,int j) 
//     {
//         if(i>=j)
//         {
//             return;
//         }
//         int team =n[i];
//         n[i] =n[j];
//         n[j]=team;

//         f(n,i+1,j-1);
        
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={1,2,3,4,5}; 
//         f(arr, 0, arr.length - 1);
//         for (int x : arr) {
//             System.out.print(x + " ");
//         }
//     }
// }


// problem 8.1:check palindrome in array

// public class recurtion {

//     static boolean f(int n[],int i,int j) 
//     {
//         if (i >= j) {
//             return true;
//         }
//         if(n[i]!=n[j])
//         {
//             return false;
//         } 
//        return f(n,i+1,j-1);
//     }
//     public static void main(String[] args) 
//     {
//         int arr[]={1,2,3,7,1};  
//         System.out.println(f(arr, 0, arr.length - 1));
       
//     }
// }

// problem 8.2: check palindrome in array

// public class recurtion {

//     static boolean f(String s,int i,int j) 
//     {
//         if (i >= j) {
//             return true;
//         }
//         if(s.charAt(i) != s.charAt(j))
//         {
//             return false;
//         } 
//        return f(s,i+1,j-1);
//     }
//     public static void main(String[] args) 
//     {
//         String s="madmmm";
//         System.out.println(f(s, 0, s.length() - 1));
       
//     }
// }