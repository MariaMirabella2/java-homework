package Tema7;
import static java.lang.Math.pow;

public class ex2 {
    public long power (int n, int p )
       throws Exception {
            if (n < 0 || p < 0)
                throw new Exception("n or p should not be negative.");
            else if(n==0 && p==0)
                    throw new Exception("n and p should not be zero.");
        return (long) pow(n,p);
    }
}
