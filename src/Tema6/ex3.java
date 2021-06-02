package Tema6;

import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ex3 {
    public static void main(String[] args) {
    String s="wellcometojava";
    int k=3;
    String smallest = s.substring(0,k);
    String largest = s.substring(0,k);

    // Complete the function
    // 'smallest' must be the lexicographically smallest substring of length 'k'
    // 'largest' must be the lexicographically largest substring of length 'k'
    String curr;
    for(int i=1;i<s.length()-k+1;i++){
        curr=s.substring(i,i+k);
        if(curr.compareTo(largest)>0){
            largest=curr;
        }
        if(curr.compareTo(smallest)<0)
            smallest=curr;
    }
        System.out.println( smallest);
        System.out.println(largest);
}
}
