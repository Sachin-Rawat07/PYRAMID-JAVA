import java.util.*;
public class uniqueElem {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[] = new int[]{1,2,4,1,3,2,4};

        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans^=arr[i];
        }
        System.out.println(ans);

    }
} 