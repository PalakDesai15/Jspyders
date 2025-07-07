import java.util.*;
class automorphic{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int p=n*n;
        boolean res=true;
        while(n>0){
            if((n%10) !=( p%10)){
                res=false;
                break;

            }
            n/=10;
            p/=10;

        }
        if(res){
            System.out.println("Automorphic");
        }else{
            System.out.println("not Automorphic");

        }
    }
}