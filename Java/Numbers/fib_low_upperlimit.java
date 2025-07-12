import java.util.*;
class fib_low_upperlimit{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        int a=0,b=1,c;
        int l=sc.nextInt();
        int u=sc.nextInt();
        while(a<=u){
            if(a>=l){
                System.out.println(a+" ");
            }
            c=a+b;
            a=b;
            b=c;
        }
    }
}