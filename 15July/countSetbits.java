import java.util.*;
public class countSetbits {
   public static void main(String[] args) {
    int n=7;
    int count=0;
    while(n>0){
        n=(n&(n-1));
        count++;
    }
    System.out.println(count);
   }


