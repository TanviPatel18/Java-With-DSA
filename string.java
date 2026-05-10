// import java.util.*;

public class string {
    public static void main(String[] args) 
    {
    //    Scanner sc = new Scanner(System.in);
    //    String  name= sc.next();
    //    String s1="hello";
    //    String s2="tanvi";
    //    String full = s1+ s2;
    //    System.out.println("concatenations:"+full);

        // System.out.println(s1.compareTo(s2));
        StringBuilder sb = new StringBuilder("hello");

        sb.append(" world");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);
    }
    
}
