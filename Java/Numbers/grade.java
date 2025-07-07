import java.util.*;
class grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your marks:");
        int a=sc.nextInt();
        if(a>=90){
            System.out.println("grade is 'A'");
        }
        else if(a>=80){
            System.out.println("grade is 'B'");
        }
        else if(a>=70){
            System.out.println("grade is 'C'");
        }
        else if(a>=60){
            System.out.println("grade is 'D'");
        }else{
            System.out.println(("grade is 'E'"));
        }
    }
}