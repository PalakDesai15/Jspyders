public class neon {
    public static void main(String args[]){
      int n=10;
      int sq=n*n;
      int sum=0;
       if (isneon(n, sq, sum))
            System.out.println(n + " is a Neon number.");
        else
            System.out.println(n + " is not a Neon number.");
    }

    
    public static boolean isneon(int n,int sq,int sum){
        if(sq==0)return n==sum;
        sum+=sq%10;
        return isneon(n,sq/10,sum);

    }
    
}
