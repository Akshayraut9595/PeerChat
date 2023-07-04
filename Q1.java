import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean ans = true;
            int k = 2;
            while(ans){
                if(n%(Math.pow(2, k)-1)==0){
                    ans = false;
                }
                else{
                    k++;
                }
            }

            System.out.println(n/((int)Math.pow(2,k)-1));
        }
    }
}