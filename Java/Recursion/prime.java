public class prime {
    public static void main(String[] args) {
        int n=10;
        System.out.println(isprime(n,n/2));
    }
    public static boolean isprime(int n,int i){
        if(i==1)return true;
        if(n<=1||n%i==0)return false;
        return isprime(n,i-1);
    }
    
}
