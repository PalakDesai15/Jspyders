import java.util.*;
class third_big_prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        for(int i=e;i>=s;i--){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
               // System.out.println(i);
                c++;
            if(c==3){
                System.out.println(i);
                break;
            }
        }

    }
}
}