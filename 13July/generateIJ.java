import java.util.*;
public class generateIJ {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i= sc.nextInt();
        int j= sc.nextInt();
        int ans=0;
        while(i>0){
            ans=ans<<1;
            ans=ans^1;
            i--;
        }

        ans=ans<<j;
        System.out.println(ans);
        sc.close();

    }
}
