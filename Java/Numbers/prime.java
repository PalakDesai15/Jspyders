import java.util.*;
class prime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        boolean p=true;
        if(n<=1){
            System.out.println("prime no.");
            return;
  
        }
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
              p=false;
              break;
            }
        }
        if(p){
            System.out.println("prime number.");
        }
        else{
            System.out.println("not a prime no.");
        }
    }
}