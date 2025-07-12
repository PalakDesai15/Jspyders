import java.util.*;
class pattern_asc_des{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the input:");
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            int num=((i-1)*n+1);
            for(int j=1;j<=n;j++){
                System.out.print(num+"\t");
                num++;

            }
        }else{
            int num=i*n;
            for(int j=1;j<=n;j++){
                System.out.print(num+"\t");
            }
        }
        System.out.println();

    }

    
}
