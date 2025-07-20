class lcm{
    public static void main(String args[]){
        int a=12,b=15;
       int l=a>b?a:b;
       int n=l;
       // for(int i=1;i<=a&&i<=b;i++){
       while(true){
            if((n%a==0)&&(n%b==0)){
                break;
            }
            n+=l;
        }
        System.out.println("The value is:"+n);

        }
        
    }
