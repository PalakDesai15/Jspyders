import java.util.*;
class bintodec{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter the number:");
                        int n =sc.nextInt();
                        int place=1;
                        int bin=0;
                        while(n>0){
                            int rem=n%2;
                            bin=bin+(rem*place);
                            place*=10;
                            n/=2;

                        }
                         System.out.println("BIN IS: "+bin);


               


    }
}