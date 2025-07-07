public class staticv{
    static int i;
    int j;
    public static void main(String args[])
    {
        staticv a1=new staticv();
        staticv a2=new staticv();
        a1.i=10;
        a2.i=20;
       // a1.i=30;
        System.out.println(a1.i);
        System.out.println(a2.i);
        a1.j=10;
        a2.j=20;
        System.out.println(a1.j);
        System.out.println(a2.j);

    }
}
    

