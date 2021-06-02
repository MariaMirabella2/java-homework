package Tema6;
import java.io.*;
import java.util.*;

public class ex4 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String Arev;
        int ok=0;
        /* Enter your code here. Print output to STDOUT. */
        for(int i=A.length()-1;i>=0;i--){
            Arev=A.substring(A.length()-i-1,A.length()-i);
            if(!(Arev.equals(A.substring(i,i+1)))){
                ok=1;
            }
        }
        if(ok==1)
            System.out.println("No");
        else
            System.out.println("Yes");

    }
}
