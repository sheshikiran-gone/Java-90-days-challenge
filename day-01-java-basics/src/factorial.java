import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scn= new Scanner(System.in);
        int n =scn.nextInt();
        int n1=fact(n);
//        System.out.println("factorial of the number",n1);
          System.out.println("factorial of the number: " + n1);
    }
    public static int fact(int n){
        int ans=1;
        for (int i = 1; i <=n; i++) {
            ans=ans*i;
        }
        return ans;
    }
}
