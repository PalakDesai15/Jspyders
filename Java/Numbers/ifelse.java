import java.util.*;
class ifelse{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your input:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("A is greater");
        }
        else if(a<b){
            System.out.println("B is greater");

        }else{
            System.out.println("Bopth are equal");

        }
    }
}