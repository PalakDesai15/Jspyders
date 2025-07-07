import java.util.*;
class eo_notmodulus{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter input:");
        int a=sc.nextInt();
        if((a&1)==0){
            System.out.println("IT IS EVEN");

        }else{
            System.out.println("IT IS ODD");


        }
    }
}