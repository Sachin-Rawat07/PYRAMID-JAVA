import java.util.*;

public class ithBitsetunset {
    public static void main(String[] args) {
        // int n=13;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i= sc.nextInt();
        // int i=4;
        int ans=n>>i-1;
        int res=ans&1;
        if(res==0) System.out.println("unset");
        else System.out.println("set");
    }
}
