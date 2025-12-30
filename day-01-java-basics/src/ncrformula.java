import java.util.Scanner;

public class ncrformula {
    public static void main(String[]args){
    Scanner scn= new Scanner(System.in);
    int n=scn.nextInt();
    int r=scn.nextInt();
    int nfactro=fact(n);
    int rfactro=fact(r);
    int nmrfactro=fact(n-r);
    int ncr=nfactro/(rfactro*nmrfactro);
    System.out.println("this is the ncr for the 5c3: "+ncr);
    }
    public static int fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans=ans*i;
        }
        return ans;
    }
}
