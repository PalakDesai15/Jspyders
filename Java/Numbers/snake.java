public class snake {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                int num=n*(i-1)+1;
                for(int j=1;j<=n;j++){
                    System.out.print(num++ +" ");
                }
            }else{
                int num=n*i;
                for(int j=1;j<=n;j++){
                    System.out.print(num--+" ");
                }
            }
            System.out.println();

        }
    }
    
}
