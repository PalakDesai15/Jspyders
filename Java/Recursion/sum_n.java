class sum_n{
    public static void main(String args[]){
       // System.out.println(sum(1));
       sum(1);

    }
    public static void sum(int n){
        if(n>9) return;
        System.out.println(n);
        sum(n+1);

    }
}