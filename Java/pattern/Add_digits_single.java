import java.util.*;
public class Add_digits_single {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input:");
        int n=sc.nextInt();
        int sum=0;
        do{
            sum=0;
            while(n>0){
                int rem=n%10;
                sum+=rem;
                n/=10;
            }
            n=sum;

        }while(n>9);
            System.out.println("sum="+sum);
        
    }
    
}
