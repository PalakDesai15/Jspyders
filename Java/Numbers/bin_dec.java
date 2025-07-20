class bin_dec{
    public static void main(String args[]){
        int p=1;
        int sum=0;
        int n=1011;
        while(n>0) {
            int rem=n%10;
            // p*=rem;
            sum+=p*rem;
            p*=2;
            n/=10;
        }
        System.out.println("value is"+sum);
    }
}