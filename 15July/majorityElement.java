
import java.util.*;



public class majorityElement {

    public static int majority(int arr[]){
        Arrays.sort(arr);

        for(int i=0;i<arr.length-2;i+=3){
            if((arr[i]==arr[i+1])&& (arr[i+1]==arr[i+2])) continue;
            else{
                return(arr[i]);
            }
        }
        return (arr[arr.length-1]);
    }

   /* public static int majority2(int arr[]){
        int ones =0;
        int twos=0;

        for(int i=0;i<arr.length;i++){
            ones=(ones^arr[i])&~twos;
            twos=(twos^arr[i])&~ones;
        }
        return ones;
       
    }*/

    public static int  majority3(int arr[]){
        int ans=0;
        int bitIndex=0;
        int l=0;
        for(bitIndex=0 ;bitIndex<32;bitIndex++){
            int count =0;

            for(i=l;i<arr.length-1;i++){
                if(arr[i]&(1<<bitIndex)) count++;
            }
            if(count %3 ==1){
                ans=ans | (1<<i);            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,1,2,4,1,4,4};
        
        // int ans=majority(arr);

        int ans=majority(arr);

        System.out.println(ans);
        
    }
    
}
