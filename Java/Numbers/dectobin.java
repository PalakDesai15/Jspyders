public class dectobin {
    public static void main(String args[]){
       int bin=1011;
       int dec=0;
       int place=1;
       while(bin>0){
        int rem=bin%10;
        dec+=(place*rem);
        place*=2;
        bin/=10;
       }
       System.out.println("no. "+dec);

    }
    
}
