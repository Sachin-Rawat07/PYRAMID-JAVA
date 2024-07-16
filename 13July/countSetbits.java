import java.util.*;
public class countSetbits {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();

        int count=0;

        for(int i=0;i<32;i++){
            int seti=n&1;
            if(seti==1) {
                count++;
              
            }
            n=n>>1;
            
        }
        System.out.println(count);
    }
    
}
