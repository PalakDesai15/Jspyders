import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        int temp=n;
        int sum=0;
        int fact=1;
        while(temp>0){
            int rem=temp%10;
            for(int i=1;i<=rem;i++){
                fact*=i;

            }
            sum+=fact;
            temp/=10;


        }
        if(sum==n){
            System.out.println("SN");
        }else{
            System.out.println("NSN");
        }
    }
}