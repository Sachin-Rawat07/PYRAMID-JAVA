import java.util.*;
public class oddEven {
    public static void main(String[] args) {

        // int n=4;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans= n&1;
        if(ans==1){
            System.out.println("odd");
        }
        else System.out.println("even");
    }
}
