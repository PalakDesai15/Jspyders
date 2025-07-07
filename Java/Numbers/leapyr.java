import java.util.*;
class leapyr{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ur input:");
        int a=sc.nextInt();
        if(a%400==0||a%100!=0 && a%4==0){
            System.out.println("IS IS A LEAP YR");
        }else{
            System.out.println("NOT A LEAP YEAR");

        }

    }
}