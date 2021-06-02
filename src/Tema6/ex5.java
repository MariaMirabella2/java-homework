package Tema6;
import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
public class ex5 {

        static boolean isAnagram(String a, String b) {
            int n=a.length();
            int n1=b.length();
            //<key,value>
            a=a.toLowerCase();
            b=b.toLowerCase();
            int fr1[]= new int[256];
            int fr2[]= new int[256];
            for(int i=0;i<=255;i++) {
                fr1[i]=0;
                fr2[i]=0;
            }
            for(int i=0;i<n;i++){
               char c=a.charAt(i);
                fr1[(int) c]++;
            }
            for(int i=0;i<n1;i++){
                char c=b.charAt(i);
                fr2[(int) c]++;
            }
            for(int ii=0;ii<=255;ii++){
               if(fr1[ii]!=fr2[ii]){
                   return false;
               }
            }
            return true;
        }

        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
