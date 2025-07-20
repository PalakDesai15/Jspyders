import java.util.*;
class gcd{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int g=1;
        for(int i=1;i<=a&&i<=b;i++){
          if(a%i==0 && b%i==0){
            g=i;
            System.out.println(g);
          }
        }
    }
}