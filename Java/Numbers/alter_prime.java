import java.util.*;
class alter_prime{
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter no.");{
        int s=sc.nextInt();
        int e=sc.nextInt();
        int c=0;
        for(int i=s;i<=e;i++){
            boolean flag=true;
            for(int j=2;j<=i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                c++;
                if(c%2!=0){
                    System.out.println(i);
                }
            }

        }
        
       }
    }
}