public class primerange {
    public static void main(String[] args) {
       
        range(1,10);
        
    }
     public static boolean isprime(int n,int i){
        if(i==1)return true;
        if(n<=1||n%i==0)return false;
        return isprime(n,i-1);
    }
    
    public static void range(int s,int e){
        if(s>e)return;
        if(isprime(s,s/2))System.out.println(s);
        range(s+1,e);
    }
    
}
  

