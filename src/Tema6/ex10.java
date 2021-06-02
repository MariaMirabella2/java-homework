package Tema6;
import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ok=0;
        for (int i = 1; i <= n; i++) {
            ok=0;
            String A = sc.next();
            A=A.toLowerCase();
            if(A.length()<8 || A.length()>30) {
                ok=1;
            }
            else
                if(A.charAt(0)>'z' || A.charAt(0)<'a') {
                    ok=1;
                }
            for(int j=1;j<A.length();j++){
                if(A.charAt(j)>'z' || (A.charAt(j)<'a' && A.charAt(j)>'9' && A.charAt(j)!='_') ){
                    ok=1;
                }
            }
            if(ok==1)
                System.out.println("Invalid");
            else
                System.out.println("Valid");

        }
    }

}
