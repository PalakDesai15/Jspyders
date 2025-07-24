public class alternate_primerange {
    public static void main(String args[]){
         range(2,10,0);
    }
public static boolean isprime(int n,int i){
        if(i==1)return true;
        if(n<=1||n%i==0)return false;
        return isprime(n,i-1);
    }
    
    public static void range(int s,int e,int c){
        if(s>e)return;
        if(isprime(s,s/2))System.out.println(s);
        c++;
        if(c%2==0){
            System.out.println(s);
           return;
        }
        range(s+1,e,c);
    }    
}

    
