import java.util.*;
public class swap {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int j= sc.nextInt();
        System.out.println("before swapping");
        System.out.println(i);
        
        System.out.println(j);
        
        i=i^j;
        j=i^j;
        i=i^j;

        System.out.println("after swapping");
        System.out.println(i);
        System.out.println(j);

    }
}
