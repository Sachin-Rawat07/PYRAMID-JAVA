import java.util.Scanner;

public class countStairsN {

    public static int  noOfWays(int n,int m){
        if(n<=2) return n;
        int count=0;
        for(int i=0;i<m &&i<n;i++){
            count+=noOfWays(n-1, m);
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=n;
        int ans=noOfWays(n,m);
        System.out.println(ans);
    }
}
