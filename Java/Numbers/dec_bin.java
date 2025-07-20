class dec_bin{
    public static void main(String args[]){
        int bin=0;
        int place=1;
        int n = 11;
        while(n>0){
            int rem=n%2;
            bin=bin+(rem*place);
            place*=10;
            n/=10;
        }
          System.out.println("the value is : "+bin);
            }
}