class pyramid{
    public static void main(String args[]){
        int n=5;
        //int space=n-1,star=1;
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");

            }for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
           // space--;
            //star+=2;
            
        }
    }

}