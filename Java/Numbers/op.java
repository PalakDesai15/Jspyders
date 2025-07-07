class op{
    static int b=2;
    int c=1;
    public static void main(String args[]){
        int a=+4;
        System.out.println(a);
        System.out.println(b);
        b=6;
        System.out.println(b);


        op abc=new op();
        op abc1=new op();
        abc1.b=88;
        System.out.println(b);


       System.out.println(abc.c);
       abc1.c=90;
       System.out.println(abc1.c);



        
    }
}