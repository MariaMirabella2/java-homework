package Tema6;
import java.io.*;
import java.util.*;
public class ex1 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>=0)
            System.out.println("Yes");
        else
            System.out.println("No");
        String Afirst;
        String Alast;
        String Bfirst;
        String Blast;
        Afirst=A.substring(0,1);
        Alast=A.substring(1);
        Bfirst=B.substring(0,1);
        Blast=B.substring(1);
        System.out.println(Afirst.toUpperCase()+Alast+" "+Bfirst.toUpperCase()+Blast);
    }
}
