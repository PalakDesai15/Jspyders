public class perfect {
    public static void main(String[] args) {
        int n=6;
        System.out.println(isperfect(n,n/2,0));
        
    }
    public static boolean isperfect(int n,int i,int sum){
        if(i==0)return n==sum;
        if(n%i==0){
            sum+=i;
        }
            return isperfect(n,i-1,sum);
        
    }
    
}
