public class armstrong {
    public static void main(String args[]){
        int n=153;
        System.out.println(arm(n,n,0));

    }
    public static boolean arm(int n,int m,int sum){
        if(n==0)return m==sum;
        sum+=Math.pow(n%10,3);
        return arm(n%10,n,0);

    }
    
}
