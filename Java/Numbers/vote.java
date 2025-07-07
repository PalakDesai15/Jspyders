import java.util.*;
class vote{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int a=sc.nextInt();
        if(a>=18){
            System.out.println("U R Eligible");
        }else{
            System.out.println("U R NOT Eligible");
        }
    }
}