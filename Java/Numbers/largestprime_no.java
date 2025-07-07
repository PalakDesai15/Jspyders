import java.util.*;
class largestprime_no{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int s=sc.nextInt();
        int e=sc.nextInt();
         for(int i=e;i>=s;i++){
            boolean flag=true;
            for(int j=2;j<i/2;j++){
                if(i%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                System.out.println(i);
                break;
            }
         }
    }
}