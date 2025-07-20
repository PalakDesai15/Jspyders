class overload{
    public static void main(String args[]){
        overload.m1(101);
        overload.m1(102,"Asha");
        overload.m1(103,"Raj",88);

    }
    public static void m1 (int a){
        System.out.println("roll no:"+a);
    }
    public static void m1 (int b,String s){
        System.out.println("enter:"+b+" "+s);
    }
    public static void m1 (int c,String a,int m){
        System.out.println("insert:"+c+" "+a+" "+m);
    }
}