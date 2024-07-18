import java.util.*;
public class seiveofEratosthenes {

    public static int seive(int n){
        boolean []arr=new boolean[n+1];
        Arrays.fill(arr,true);
        for(int i=2;i*i<=n;i++){
            if(arr[i]==true){
                for(int j=i*i;j<=n;j+=i){
                    arr[j]=false;
                }
            }
        }
        int count=0;
        for(int i=2;i<=n;i++){
            if(arr[i]==true) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int n=17;
        int countPrime=seive(n);
        System.out.println(countPrime);
    }
}
