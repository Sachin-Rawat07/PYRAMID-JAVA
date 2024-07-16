public class setBitij {
    public static void main(String[] args) {
        int i=2;
        int j=4;

        int ans=1;
        int count=0;
        while(j>0){
            if(count== i ){
                ans=ans^1;
                
            }
            ans=ans<<1;
            count++;
            j--;

        }
        System.out.println(ans);
    }
}
