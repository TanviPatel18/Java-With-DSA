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

//  problem 5: backtraking n->1
public class recurtion {
    public static void f(int i,int n)
    {
        if(i>n)
        {
          return;
        }
        f(i+1,n);
        System.out.println(i);
    }    
    public static void main(String[] args)
    {
        f(1,5);
    }
}