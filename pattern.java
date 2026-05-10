public class pattern {
    public static void main(String[] args) {
        
        /* Q1:
           ####
           ####
           ####
           ####
        
        for (int i =1;i<=5;i++)
        {
            for (int j =1;j<=5;j++){
            System.out.print("#");
            }
            System.out.print("\n");             
        } 
        
        */



        /* Q2:
           ####
           #  #
           #  #
           ####
       
       int n=4;
       int m=5;

        for (int i =1;i<=n;i++)
        {
            for (int j =1;j<=m;j++)
            {
                if(i==1|| j==1||i==4||j==5)
                {
                    System.out.print("#");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.print("\n");             
        } 
        */

        // for (int i =5;i>=1;i--)
        // {
        //     for (int j =1;j<=i;j++){
        //     System.out.print(j+" ");
        //     }
        //     System.out.print("\n");             
        // } 
         

        /* 
        int n =4;
        for (int i =1;i<=n;i++)
        {
            for (int j =1;j<=i;j++){
              System.out.print("*");
            }

            for (int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
              System.out.print("*");
            }
            System.out.println();          
        } 
        for (int i =n;i>=1;i--)
        {
            for (int j =1;j<=i;j++){
              System.out.print("*");
            }
            for (int k=1;k<=2*(n-i);k++)
            {
                System.out.print(" ");
            }
            for (int j =1;j<=i;j++){
              System.out.print("*");
            }
            System.out.println();          
        }*/
       /* 
        int n =5;
        for(int i =n;i>=1;i--)
        {
            for(int j=1;j<=(i-1);j++)
            {
              System.out.print(" ");
            }
            for (int j =1;j<=5;j++){
              System.out.print("*");
            }
            for(int j=1;j<=(n-i);j++)
            {
              System.out.print(" ");
            }
            System.out.println();          
        }*/
       
        /*
        int n = 4;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print(i + " ");
            }   
            System.out.println();
        }
        */
        int n = 5;

        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int j=i; j>=1; j--){
                System.out.print(j);
            }   
            System.out.println();
        } 
    }
}
