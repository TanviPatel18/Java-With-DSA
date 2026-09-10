import java.util.Scanner;

public class petten {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        

       for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {

                if (j >= 5 - i + 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
        
    }
}

