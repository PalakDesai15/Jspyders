public class A{
    static int i;
    int j;
    public static void main(String args[])
    {
        A a1=new A();
        A a2=new A();
        a1.i=10;
        a1.i=20;
        System.out.println(a1.i);
        System.out.println(a2.i);
        a1.j=10;
        a1.j=20;
        System.out.println(a1.j);
        System.out.println(a2.j);

    }
}
    

