import java.util.*;
class practice{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no.");
        int n=sc.nextInt();
        boolean p=true;
        for(int i=2;i<n/2;i++){
            if(n%i==0){
                p=false;
                break;
            }
        }
        if(p){
            System.out.println("PRIME");
        }else{
            System.out.println("NOT PRIME");
        }
       
    }
}