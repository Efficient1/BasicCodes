package PhaseOne;


import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        boolean either = isP(n);
        System.out.println(either);
    }
    static boolean isP(int n){
        if(n==1){
            return false;
        }
        int c=2;
        while(c*c<n){            //why the c*c,
            if(n%c==0){          //cause here you can check by just sqrt c times instead of c times
                return false;
            }
            c++;
        }
        return c*c>n;            //or true
    }
}

/* suppose N(entered number) =a*b, and a<b
   by multiplying a with a*b
   a^2<=ab
   by multiplying b with a*b
   ab<=b^2
   deriving 1 and 2
   a^2<=N<=b^2
   a<=sqrt(N)<=b
   (at least one of the factors of N must be less
   than sqrt(N))
 */